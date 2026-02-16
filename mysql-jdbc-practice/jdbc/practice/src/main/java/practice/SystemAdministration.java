package practice;

import java.sql.*;

public class SystemAdministration{
    private static void createAuditLogTable(Connection connection) throws Exception{
        String createAuditLogTableQuery =
                "CREATE TABLE IF NOT EXISTS audit_log (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "table_name VARCHAR(100)," +
                "action_type VARCHAR(50)," +
                "user_name VARCHAR(100)," +
                "action_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
        connection.prepareStatement(createAuditLogTableQuery).execute();
    }

    private static void manageSpecialtyLookup(Connection connection) throws Exception{
        String insertSpecialtyQuery = "INSERT INTO specialty (name) VALUES (?)";
        PreparedStatement insertSpecialtyStatement = connection.prepareStatement(insertSpecialtyQuery);
        insertSpecialtyStatement.setString(1, "specialty3");
        insertSpecialtyStatement.executeUpdate();

        String updateSpecialtyQuery = "UPDATE specialty SET name = ? WHERE id = ?";
        PreparedStatement updateSpecialtyStatement = connection.prepareStatement(updateSpecialtyQuery);
        updateSpecialtyStatement.setString(1, "specialty3_updated");
        updateSpecialtyStatement.setInt(2, 3);
        updateSpecialtyStatement.executeUpdate();

        String deleteSpecialtyQuery = "DELETE FROM specialty WHERE id = ?";
        PreparedStatement deleteSpecialtyStatement = connection.prepareStatement(deleteSpecialtyQuery);
        deleteSpecialtyStatement.setInt(1, 3);
        deleteSpecialtyStatement.executeUpdate();
    }

    private static void databaseBackupValidation(Connection connection) throws Exception{
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        ResultSet tablesResultSet = databaseMetaData.getTables(null, null, "%", new String[]{"TABLE"});

        while(tablesResultSet.next()){
            String tableName = tablesResultSet.getString("TABLE_NAME");
            System.out.println("Table: " + tableName);

            ResultSet columnsResultSet = databaseMetaData.getColumns(null, null, tableName, "%");
            while(columnsResultSet.next()){
                System.out.println(
                        columnsResultSet.getString("COLUMN_NAME") + " " +
                        columnsResultSet.getString("TYPE_NAME"));
            }
        }
    }

    private static void viewSystemAuditLogs(Connection connection) throws Exception{
        String insertAuditQuery = "INSERT INTO audit_log (table_name, action_type, user_name) VALUES (?, ?, ?)";
        PreparedStatement insertAuditStatement = connection.prepareStatement(insertAuditQuery);
        insertAuditStatement.setString(1, "doctor");
        insertAuditStatement.setString(2, "UPDATE");
        insertAuditStatement.setString(3, "admin");
        insertAuditStatement.executeUpdate();

        String auditQuery = "SELECT table_name, action_type, user_name, action_time " +
                "FROM audit_log " +
                "WHERE user_name = ? AND table_name = ?";

        PreparedStatement auditStatement = connection.prepareStatement(auditQuery);
        auditStatement.setString(1, "admin");
        auditStatement.setString(2, "doctor");

        ResultSet auditResultSet = auditStatement.executeQuery();

        while(auditResultSet.next()){
            System.out.println(
                    auditResultSet.getString("table_name") + " " +
                    auditResultSet.getString("action_type") + " " +
                    auditResultSet.getString("user_name") + " " +
                    auditResultSet.getTimestamp("action_time"));
        }
    }

    public static void main(String[] args) throws Exception{
        Connection connection = Utility.getConnection();
        createAuditLogTable(connection);
        manageSpecialtyLookup(connection);
        databaseBackupValidation(connection);
        viewSystemAuditLogs(connection);
        connection.close();
    }
}
