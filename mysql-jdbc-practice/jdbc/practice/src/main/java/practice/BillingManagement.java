package practice;

import java.sql.*;

public class BillingManagement{
    private static void createBillingTables(Connection connection) throws Exception{
        String createBillTableQuery = "CREATE TABLE IF NOT EXISTS bill (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "visit_id INT," +
                "total_amount DECIMAL(10,2)," +
                "payment_status VARCHAR(20)," +
                "payment_date DATE," +
                "payment_mode VARCHAR(50)," +
                "FOREIGN KEY (visit_id) REFERENCES visit(id))";

        String createBillItemTableQuery = "CREATE TABLE IF NOT EXISTS bill_item (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "bill_id INT," +
                "item_name VARCHAR(255)," +
                "amount DECIMAL(10,2)," +
                "FOREIGN KEY (bill_id) REFERENCES bill(id))";

        String createPaymentTransactionTableQuery = "CREATE TABLE IF NOT EXISTS payment_transaction (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "bill_id INT," +
                "transaction_date DATETIME," +
                "amount DECIMAL(10,2)," +
                "mode VARCHAR(50)," +
                "FOREIGN KEY (bill_id) REFERENCES bill(id))";

        connection.prepareStatement(createBillTableQuery).execute();
        connection.prepareStatement(createBillItemTableQuery).execute();
        connection.prepareStatement(createPaymentTransactionTableQuery).execute();
    }

    private static void generateBillForVisit(Connection connection) throws Exception{
        String selectConsultationFeeQuery = "SELECT consultation_fee FROM doctor WHERE id = ?";
        PreparedStatement selectConsultationFeeStatement = connection.prepareStatement(selectConsultationFeeQuery);
        selectConsultationFeeStatement.setInt(1, 1);
        ResultSet feeResultSet = selectConsultationFeeStatement.executeQuery();
        feeResultSet.next();
        double consultationFee = feeResultSet.getDouble("consultation_fee");

        String insertBillQuery = "INSERT INTO bill (visit_id, total_amount, payment_status) VALUES (?, ?, ?)";
        PreparedStatement insertBillStatement = connection.prepareStatement(insertBillQuery);
        insertBillStatement.setInt(1, 1);
        insertBillStatement.setDouble(2, consultationFee);
        insertBillStatement.setString(3, "UNPAID");
        insertBillStatement.executeUpdate();

        String insertBillItemQuery = "INSERT INTO bill_item (bill_id, item_name, amount) VALUES (?, ?, ?)";
        PreparedStatement insertBillItemStatement = connection.prepareStatement(insertBillItemQuery);
        insertBillItemStatement.setInt(1, 1);
        insertBillItemStatement.setString(2, "extra_charge1");
        insertBillItemStatement.setDouble(3, 200);
        insertBillItemStatement.executeUpdate();

        String updateTotalQuery = "UPDATE bill SET total_amount = (" +
                "SELECT SUM(amount) + ? FROM bill_item WHERE bill_id = ?) WHERE id = ?";
        PreparedStatement updateTotalStatement = connection.prepareStatement(updateTotalQuery);
        updateTotalStatement.setDouble(1, consultationFee);
        updateTotalStatement.setInt(2, 1);
        updateTotalStatement.setInt(3, 1);
        updateTotalStatement.executeUpdate();
    }

    private static void recordPayment(Connection connection) throws Exception{
        connection.setAutoCommit(false);

        String updateBillQuery = "UPDATE bill SET payment_status = 'PAID', payment_date = ?, payment_mode = ? WHERE id = ?";
        PreparedStatement updateBillStatement = connection.prepareStatement(updateBillQuery);
        updateBillStatement.setDate(1, Date.valueOf("2026-05-02"));
        updateBillStatement.setString(2, "CASH");
        updateBillStatement.setInt(3, 1);
        updateBillStatement.executeUpdate();

        String insertTransactionQuery = "INSERT INTO payment_transaction (bill_id, transaction_date, amount, mode) VALUES (?, ?, ?, ?)";
        PreparedStatement insertTransactionStatement = connection.prepareStatement(insertTransactionQuery);
        insertTransactionStatement.setInt(1, 1);
        insertTransactionStatement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
        insertTransactionStatement.setDouble(3, 700 + 200);
        insertTransactionStatement.setString(4, "CASH");
        insertTransactionStatement.executeUpdate();

        connection.commit();
        connection.setAutoCommit(true);
    }

    private static void viewOutstandingBills(Connection connection) throws Exception{
        String outstandingQuery =
                "SELECT p.name, COUNT(b.id) AS total_unpaid, SUM(b.total_amount) AS total_due " +
                "FROM bill b " +
                "INNER JOIN visit v ON b.visit_id = v.id " +
                "INNER JOIN appointment a ON v.appointment_id = a.id " +
                "INNER JOIN patient p ON a.patient_id = p.id " +
                "WHERE b.payment_status = 'UNPAID' " +
                "GROUP BY p.name";

        PreparedStatement outstandingStatement = connection.prepareStatement(outstandingQuery);
        ResultSet resultSet = outstandingStatement.executeQuery();

        while(resultSet.next()){
            System.out.println(
                    resultSet.getString("name") + " " +
                    resultSet.getInt("total_unpaid") + " " +
                    resultSet.getDouble("total_due"));
        }
    }

    private static void generateRevenueReport(Connection connection) throws Exception{
        String revenueQuery =
                "SELECT d.name AS doctor_name, s.name AS specialty_name, SUM(b.total_amount) AS revenue " +
                "FROM bill b " +
                "INNER JOIN visit v ON b.visit_id = v.id " +
                "INNER JOIN appointment a ON v.appointment_id = a.id " +
                "INNER JOIN doctor d ON a.doctor_id = d.id " +
                "LEFT JOIN specialty s ON d.specialty_id = s.id " +
                "WHERE b.payment_status = 'PAID' AND b.payment_date BETWEEN ? AND ? " +
                "GROUP BY d.name, s.name " +
                "HAVING revenue > ?";

        PreparedStatement revenueStatement = connection.prepareStatement(revenueQuery);
        revenueStatement.setDate(1, Date.valueOf("2026-01-01"));
        revenueStatement.setDate(2, Date.valueOf("2026-12-31"));
        revenueStatement.setDouble(3, 100);

        ResultSet resultSet = revenueStatement.executeQuery();

        while(resultSet.next()){
            System.out.println(
                    resultSet.getString("doctor_name") + " " +
                    resultSet.getString("specialty_name") + " " +
                    resultSet.getDouble("revenue"));
        }
    }

    public static void main(String[] args) throws Exception{
        Connection connection = Utility.getConnection();
        createBillingTables(connection);
        generateBillForVisit(connection);
        recordPayment(connection);
        viewOutstandingBills(connection);
        generateRevenueReport(connection);
        connection.close();
    }
}
