package practice;

import java.sql.*;

public class DoctorManagement{
    private static void createTables(Connection connection) throws Exception{
        String createSpecialtyTableQuery = "CREATE TABLE IF NOT EXISTS specialty (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(255) UNIQUE)";

        String createScheduleTableQuery = "CREATE TABLE IF NOT EXISTS schedule (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "doctor_id INT," +
                "day VARCHAR(20)," +
                "time VARCHAR(50)," +
                "FOREIGN KEY (doctor_id) REFERENCES doctor(id))";

        connection.prepareStatement(createSpecialtyTableQuery).execute();
        connection.prepareStatement(createScheduleTableQuery).execute();
    }

    private static void addDoctorProfile(Connection connection) throws Exception{
        String insertSpecialtyQuery = "INSERT INTO specialty (name) VALUES (?)";
        PreparedStatement insertSpecialtyStatement = connection.prepareStatement(insertSpecialtyQuery);
        insertSpecialtyStatement.setString(1, "specialty1");
        insertSpecialtyStatement.executeUpdate();

        String insertDoctorQuery = "INSERT INTO doctor (name, contact, consultation_fee, specialty_id, is_active) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement insertDoctorStatement = connection.prepareStatement(insertDoctorQuery);
        insertDoctorStatement.setString(1, "doctor2");
        insertDoctorStatement.setString(2, "contact3");
        insertDoctorStatement.setDouble(3, 700);
        insertDoctorStatement.setInt(4, 1);
        insertDoctorStatement.setBoolean(5, true);
        insertDoctorStatement.executeUpdate();

        String insertScheduleQuery = "INSERT INTO schedule (doctor_id, day, time) VALUES (?, ?, ?)";
        PreparedStatement insertScheduleStatement = connection.prepareStatement(insertScheduleQuery);
        insertScheduleStatement.setInt(1, 1);
        insertScheduleStatement.setString(2, "Monday");
        insertScheduleStatement.setString(3, "10AM-5PM");
        insertScheduleStatement.executeUpdate();
    }

    private static void updateDoctorSpecialty(Connection connection) throws Exception{
        connection.setAutoCommit(false);

        String insertNewSpecialtyQuery = "INSERT INTO specialty (name) VALUES (?)";
        PreparedStatement insertNewSpecialtyStatement = connection.prepareStatement(insertNewSpecialtyQuery);
        insertNewSpecialtyStatement.setString(1, "specialty2");
        insertNewSpecialtyStatement.executeUpdate();

        String updateDoctorSpecialtyQuery = "UPDATE doctor SET specialty_id = ? WHERE id = ?";
        PreparedStatement updateDoctorSpecialtyStatement = connection.prepareStatement(updateDoctorSpecialtyQuery);
        updateDoctorSpecialtyStatement.setInt(1, 2);
        updateDoctorSpecialtyStatement.setInt(2, 1);
        updateDoctorSpecialtyStatement.executeUpdate();

        connection.commit();
        connection.setAutoCommit(true);
    }

    private static void viewDoctorsBySpecialty(Connection connection) throws Exception{
        String viewDoctorsQuery =
                "SELECT d.name, s.name AS specialty_name, sch.day, sch.time " +
                "FROM doctor d " +
                "INNER JOIN specialty s ON d.specialty_id = s.id " +
                "INNER JOIN schedule sch ON d.id = sch.doctor_id " +
                "WHERE s.id = ?";

        PreparedStatement viewDoctorsStatement = connection.prepareStatement(viewDoctorsQuery);
        viewDoctorsStatement.setInt(1, 2);
        ResultSet doctorResultSet = viewDoctorsStatement.executeQuery();

        while(doctorResultSet.next()){
            System.out.println(
                    doctorResultSet.getString("name") + " " +
                    doctorResultSet.getString("specialty_name") + " " +
                    doctorResultSet.getString("day") + " " +
                    doctorResultSet.getString("time"));
        }
    }

    private static void deactivateDoctorProfile(Connection connection) throws Exception{
        String checkFutureAppointmentQuery =
                "SELECT COUNT(*) FROM appointment WHERE doctor_id = ? AND appointment_date > ?";
        PreparedStatement checkFutureAppointmentStatement = connection.prepareStatement(checkFutureAppointmentQuery);
        checkFutureAppointmentStatement.setInt(1, 1);
        checkFutureAppointmentStatement.setDate(2, Date.valueOf("2025-01-01"));
        ResultSet appointmentResultSet = checkFutureAppointmentStatement.executeQuery();
        appointmentResultSet.next();
        int count = appointmentResultSet.getInt(1);

        if(count == 0){
            String deactivateDoctorQuery = "UPDATE doctor SET is_active = false WHERE id = ?";
            PreparedStatement deactivateDoctorStatement = connection.prepareStatement(deactivateDoctorQuery);
            deactivateDoctorStatement.setInt(1, 1);
            deactivateDoctorStatement.executeUpdate();
        }
    }

    public static void main(String[] args) throws Exception{
        Connection connection = Utility.getConnection();
        createTables(connection);
        addDoctorProfile(connection);
        updateDoctorSpecialty(connection);
        viewDoctorsBySpecialty(connection);
        deactivateDoctorProfile(connection);
        connection.close();
    }
}
