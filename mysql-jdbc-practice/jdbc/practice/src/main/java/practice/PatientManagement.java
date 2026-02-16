package practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.Time;

public class PatientManagement{
    private static void createTables(Connection connection) throws Exception{
        String createPatientTableQuery = "CREATE TABLE IF NOT EXISTS patient (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(255) NOT NULL," +
                "dob DATE," +
                "contact VARCHAR(15) UNIQUE," +
                "address VARCHAR(255)," +
                "blood_group VARCHAR(5))";

        String createDoctorTableQuery = "CREATE TABLE IF NOT EXISTS doctor (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(255) NOT NULL," +
                "contact VARCHAR(15)," +
                "consultation_fee DECIMAL(10,2)," +
                "specialty_id INT," +
                "is_active BOOLEAN DEFAULT TRUE)";

        String createAppointmentTableQuery = "CREATE TABLE IF NOT EXISTS appointment (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "patient_id INT," +
                "doctor_id INT," +
                "appointment_date DATE," +
                "appointment_time TIME," +
                "status VARCHAR(20)," +
                "FOREIGN KEY (patient_id) REFERENCES patient(id)," +
                "FOREIGN KEY (doctor_id) REFERENCES doctor(id))";

        String createVisitTableQuery = "CREATE TABLE IF NOT EXISTS visit (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "appointment_id INT," +
                "diagnosis VARCHAR(255)," +
                "prescription_notes VARCHAR(255)," +
                "visit_date DATE," +
                "FOREIGN KEY (appointment_id) REFERENCES appointment(id))";

        connection.prepareStatement(createPatientTableQuery).execute();
        connection.prepareStatement(createDoctorTableQuery).execute();
        connection.prepareStatement(createAppointmentTableQuery).execute();
        connection.prepareStatement(createVisitTableQuery).execute();
    }

    private static void registerPatient(Connection connection) throws Exception{
        String selectPatientQuery = "SELECT id FROM patient WHERE contact = ?";
        PreparedStatement selectPatientStatement = connection.prepareStatement(selectPatientQuery);
        selectPatientStatement.setString(1, "contact1");
        ResultSet patientResultSet = selectPatientStatement.executeQuery();

        if(!patientResultSet.next()){
            String insertPatientQuery = "INSERT INTO patient (name, dob, contact, address, blood_group) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertPatientStatement = connection.prepareStatement(insertPatientQuery);
            insertPatientStatement.setString(1, "patient1");
            insertPatientStatement.setDate(2, Date.valueOf("2000-01-01"));
            insertPatientStatement.setString(3, "contact1");
            insertPatientStatement.setString(4, "address1");
            insertPatientStatement.setString(5, "B+");
            insertPatientStatement.executeUpdate();
        }
    }

    private static void updatePatientInformation(Connection connection) throws Exception{
        String selectPatientIdQuery = "SELECT id FROM patient WHERE contact = ?";
        PreparedStatement selectPatientIdStatement = connection.prepareStatement(selectPatientIdQuery);
        selectPatientIdStatement.setString(1, "contact1");
        ResultSet patientResultSet = selectPatientIdStatement.executeQuery();

        if(patientResultSet.next()){
            int patientId = patientResultSet.getInt("id");
            String updatePatientQuery = "UPDATE patient SET address = ?, blood_group = ? WHERE id = ?";
            PreparedStatement updatePatientStatement = connection.prepareStatement(updatePatientQuery);
            updatePatientStatement.setString(1, "address2");
            updatePatientStatement.setString(2, "A+");
            updatePatientStatement.setInt(3, patientId);
            updatePatientStatement.executeUpdate();
        }
    }

    private static void searchPatientRecords(Connection connection) throws Exception{
        String searchPatientQuery = "SELECT * FROM patient WHERE name LIKE ? OR contact = ?";
        PreparedStatement searchPatientStatement = connection.prepareStatement(searchPatientQuery);
        searchPatientStatement.setString(1, "patient%");
        searchPatientStatement.setString(2, "contact1");
        ResultSet patientResultSet = searchPatientStatement.executeQuery();

        while(patientResultSet.next()){
            System.out.println(
                    patientResultSet.getInt("id") + " " +
                    patientResultSet.getString("name") + " " +
                    patientResultSet.getString("contact"));
        }
    }

    private static void viewPatientVisitHistory(Connection connection) throws Exception{
        String selectPatientQuery = "SELECT id FROM patient WHERE contact = ?";
        PreparedStatement selectPatientStatement = connection.prepareStatement(selectPatientQuery);
        selectPatientStatement.setString(1, "contact1");
        ResultSet patientResultSet = selectPatientStatement.executeQuery();

        if(patientResultSet.next()){
            int patientId = patientResultSet.getInt("id");

            String selectVisitHistoryQuery =
                    "SELECT v.visit_date, d.name AS doctor_name, v.diagnosis " +
                    "FROM visit v " +
                    "INNER JOIN appointment a ON v.appointment_id = a.id " +
                    "INNER JOIN doctor d ON a.doctor_id = d.id " +
                    "WHERE a.patient_id = ? " +
                    "ORDER BY v.visit_date DESC";

            PreparedStatement selectVisitHistoryStatement = connection.prepareStatement(selectVisitHistoryQuery);
            selectVisitHistoryStatement.setInt(1, patientId);
            ResultSet visitHistoryResultSet = selectVisitHistoryStatement.executeQuery();

            while(visitHistoryResultSet.next()){
                System.out.println(
                        visitHistoryResultSet.getDate("visit_date") + " " +
                        visitHistoryResultSet.getString("doctor_name") + " " +
                        visitHistoryResultSet.getString("diagnosis"));
            }
        }
    }

    
    public static void main(String[] args) throws Exception{
        Connection connection = Utility.getConnection();
        createTables(connection);
        registerPatient(connection);
        updatePatientInformation(connection);
        searchPatientRecords(connection);
        viewPatientVisitHistory(connection);
        connection.close();
    }
}
