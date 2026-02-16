package practice;

import java.sql.*;

public class AppointmentScheduling{
    private static void createAuditTable(Connection connection) throws Exception{
        String createAuditTableQuery = "CREATE TABLE IF NOT EXISTS appointment_audit (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "appointment_id INT," +
                "action VARCHAR(50)," +
                "FOREIGN KEY (appointment_id) REFERENCES appointment(id))";
        connection.prepareStatement(createAuditTableQuery).execute();
    }

    private static void bookNewAppointment(Connection connection) throws Exception{
        String checkAvailabilityQuery = "SELECT COUNT(*) FROM appointment WHERE doctor_id = ? AND appointment_date = ? AND appointment_time = ? AND status = 'SCHEDULED'";
        PreparedStatement checkAvailabilityStatement = connection.prepareStatement(checkAvailabilityQuery);
        checkAvailabilityStatement.setInt(1, 1);
        checkAvailabilityStatement.setDate(2, Date.valueOf("2026-05-01"));
        checkAvailabilityStatement.setTime(3, Time.valueOf("11:00:00"));
        ResultSet availabilityResultSet = checkAvailabilityStatement.executeQuery();
        availabilityResultSet.next();
        int bookedCount = availabilityResultSet.getInt(1);

        if(bookedCount == 0){
            String insertAppointmentQuery = "INSERT INTO appointment (patient_id, doctor_id, appointment_date, appointment_time, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertAppointmentStatement = connection.prepareStatement(insertAppointmentQuery);
            insertAppointmentStatement.setInt(1, 1);
            insertAppointmentStatement.setInt(2, 1);
            insertAppointmentStatement.setDate(3, Date.valueOf("2026-05-01"));
            insertAppointmentStatement.setTime(4, Time.valueOf("11:00:00"));
            insertAppointmentStatement.setString(5, "SCHEDULED");
            insertAppointmentStatement.executeUpdate();
        }
    }

    private static void checkDoctorAvailability(Connection connection) throws Exception{
        String availabilityQuery = "SELECT appointment_time, COUNT(*) AS total_bookings " +
                "FROM appointment WHERE doctor_id = ? AND appointment_date = ? AND status = 'SCHEDULED' " +
                "GROUP BY appointment_time";

        PreparedStatement availabilityStatement = connection.prepareStatement(availabilityQuery);
        availabilityStatement.setInt(1, 1);
        availabilityStatement.setDate(2, Date.valueOf("2026-05-01"));
        ResultSet availabilityResultSet = availabilityStatement.executeQuery();

        while(availabilityResultSet.next()){
            System.out.println(
                    availabilityResultSet.getTime("appointment_time") + " " +
                    availabilityResultSet.getInt("total_bookings"));
        }
    }

    private static void cancelAppointment(Connection connection) throws Exception{
        connection.setAutoCommit(false);

        String cancelAppointmentQuery = "UPDATE appointment SET status = 'CANCELLED' WHERE id = ?";
        PreparedStatement cancelAppointmentStatement = connection.prepareStatement(cancelAppointmentQuery);
        cancelAppointmentStatement.setInt(1, 1);
        cancelAppointmentStatement.executeUpdate();

        String insertAuditQuery = "INSERT INTO appointment_audit (appointment_id, action) VALUES (?, ?)";
        PreparedStatement insertAuditStatement = connection.prepareStatement(insertAuditQuery);
        insertAuditStatement.setInt(1, 1);
        insertAuditStatement.setString(2, "CANCELLED");
        insertAuditStatement.executeUpdate();

        connection.commit();
        connection.setAutoCommit(true);
    }

    private static void rescheduleAppointment(Connection connection) throws Exception{
        connection.setAutoCommit(false);

        String checkNewSlotQuery = "SELECT COUNT(*) FROM appointment WHERE doctor_id = ? AND appointment_date = ? AND appointment_time = ? AND status = 'SCHEDULED'";
        PreparedStatement checkNewSlotStatement = connection.prepareStatement(checkNewSlotQuery);
        checkNewSlotStatement.setInt(1, 1);
        checkNewSlotStatement.setDate(2, Date.valueOf("2026-05-02"));
        checkNewSlotStatement.setTime(3, Time.valueOf("12:00:00"));
        ResultSet slotResultSet = checkNewSlotStatement.executeQuery();
        slotResultSet.next();
        int count = slotResultSet.getInt(1);

        if(count == 0){
            String updateAppointmentQuery = "UPDATE appointment SET appointment_date = ?, appointment_time = ?, status = 'SCHEDULED' WHERE id = ?";
            PreparedStatement updateAppointmentStatement = connection.prepareStatement(updateAppointmentQuery);
            updateAppointmentStatement.setDate(1, Date.valueOf("2026-05-02"));
            updateAppointmentStatement.setTime(2, Time.valueOf("12:00:00"));
            updateAppointmentStatement.setInt(3, 1);
            updateAppointmentStatement.executeUpdate();
            connection.commit();
        }
        else connection.rollback();

        connection.setAutoCommit(true);
    }

    private static void viewDailyAppointmentSchedule(Connection connection) throws Exception{
        String scheduleQuery =
                "SELECT a.appointment_time, p.name AS patient_name, d.name AS doctor_name, a.status " +
                "FROM appointment a " +
                "INNER JOIN patient p ON a.patient_id = p.id " +
                "INNER JOIN doctor d ON a.doctor_id = d.id " +
                "WHERE a.appointment_date = ? " +
                "ORDER BY a.appointment_time";

        PreparedStatement scheduleStatement = connection.prepareStatement(scheduleQuery);
        scheduleStatement.setDate(1, Date.valueOf("2026-05-02"));
        ResultSet scheduleResultSet = scheduleStatement.executeQuery();

        while(scheduleResultSet.next()){
            System.out.println(
                    scheduleResultSet.getTime("appointment_time") + " " +
                    scheduleResultSet.getString("patient_name") + " " +
                    scheduleResultSet.getString("doctor_name") + " " +
                    scheduleResultSet.getString("status"));
        }
    }
    
    public static void main(String[] args) throws Exception{
        Connection connection = Utility.getConnection();
        createAuditTable(connection);
        bookNewAppointment(connection);
        checkDoctorAvailability(connection);
        cancelAppointment(connection);
        rescheduleAppointment(connection);
        viewDailyAppointmentSchedule(connection);
        connection.close();
    }
}
