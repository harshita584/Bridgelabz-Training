package practice;

import java.sql.*;

public class VisitManagement{
    private static void createPrescriptionTable(Connection connection) throws Exception{
        String createPrescriptionTableQuery = "CREATE TABLE IF NOT EXISTS prescription (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "visit_id INT," +
                "medicine_name VARCHAR(255)," +
                "dosage VARCHAR(100)," +
                "duration VARCHAR(100)," +
                "FOREIGN KEY (visit_id) REFERENCES visit(id))";
        connection.prepareStatement(createPrescriptionTableQuery).execute();
    }

    private static void recordPatientVisit(Connection connection) throws Exception{
        connection.setAutoCommit(false);

        String insertVisitQuery = "INSERT INTO visit (appointment_id, diagnosis, prescription_notes, visit_date) VALUES (?, ?, ?, ?)";
        PreparedStatement insertVisitStatement = connection.prepareStatement(insertVisitQuery);
        insertVisitStatement.setInt(1, 1);
        insertVisitStatement.setString(2, "diagnosis2");
        insertVisitStatement.setString(3, "notes2");
        insertVisitStatement.setDate(4, Date.valueOf("2026-05-02"));
        insertVisitStatement.executeUpdate();

        String updateAppointmentQuery = "UPDATE appointment SET status = 'COMPLETED' WHERE id = ?";
        PreparedStatement updateAppointmentStatement = connection.prepareStatement(updateAppointmentQuery);
        updateAppointmentStatement.setInt(1, 1);
        updateAppointmentStatement.executeUpdate();

        connection.commit();
        connection.setAutoCommit(true);
    }

    private static void addPrescriptionDetails(Connection connection) throws Exception{
        String insertPrescriptionQuery = "INSERT INTO prescription (visit_id, medicine_name, dosage, duration) VALUES (?, ?, ?, ?)";
        PreparedStatement insertPrescriptionStatement = connection.prepareStatement(insertPrescriptionQuery);

        insertPrescriptionStatement.setInt(1, 1);
        insertPrescriptionStatement.setString(2, "medicine1");
        insertPrescriptionStatement.setString(3, "1 tablet");
        insertPrescriptionStatement.setString(4, "5 days");
        insertPrescriptionStatement.addBatch();

        insertPrescriptionStatement.setInt(1, 1);
        insertPrescriptionStatement.setString(2, "medicine2");
        insertPrescriptionStatement.setString(3, "2 tablets");
        insertPrescriptionStatement.setString(4, "7 days");
        insertPrescriptionStatement.addBatch();

        insertPrescriptionStatement.executeBatch();
    }

    private static void viewPatientMedicalHistory(Connection connection) throws Exception{
        String medicalHistoryQuery =
                "SELECT v.visit_date, d.name AS doctor_name, v.diagnosis, " +
                "p.medicine_name, p.dosage, p.duration " +
                "FROM visit v " +
                "INNER JOIN appointment a ON v.appointment_id = a.id " +
                "INNER JOIN doctor d ON a.doctor_id = d.id " +
                "INNER JOIN prescription p ON v.id = p.visit_id " +
                "WHERE a.patient_id = ? " +
                "ORDER BY v.visit_date DESC";

        PreparedStatement medicalHistoryStatement = connection.prepareStatement(medicalHistoryQuery);
        medicalHistoryStatement.setInt(1, 1);
        ResultSet historyResultSet = medicalHistoryStatement.executeQuery();

        while(historyResultSet.next()){
            System.out.println(
                    historyResultSet.getDate("visit_date") + " " + historyResultSet.getString("doctor_name") + " " +
                    historyResultSet.getString("diagnosis") + " " + historyResultSet.getString("medicine_name") + " " +
                    historyResultSet.getString("dosage") + " " + historyResultSet.getString("duration"));
        }
    }

    public static void main(String[] args) throws Exception{
        Connection connection = Utility.getConnection();
        createPrescriptionTable(connection);
        recordPatientVisit(connection);
        addPrescriptionDetails(connection);
        viewPatientMedicalHistory(connection);
        connection.close();
    }
}

