package pl.coderslab.entity;
import java.sql.*;
import java.util.Locale;

public class DBUtil {

        private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8";
        private static final String DB_USER = "root";
        private static final String DB_PASS = "coderslab123";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        }






/*

    private static final String DB_USER = "root";
    private static final String DB_PASS = "coderslab123";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static final String DB_URL_ADJUSTABLE = "jdbc:mysql://localhost:3306/DBNAME?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static final String DELETE_QUERY = "DELETE FROM tableName where id = ?";


    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    public static Connection connect(String databaseName) throws SQLException {
        return DriverManager.getConnection(DB_URL_ADJUSTABLE.replace("DBNAME", databaseName), DB_USER, DB_PASS);
    }


    public static void insert(Connection conn, String query, String... params) {
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                statement.setString(i + 1, params[i]);
            }
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void printData(Connection conn, String query, String... columnNames) throws SQLException {

        try (PreparedStatement statement = conn.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                for (String columnName : columnNames) {
                    System.out.print(resultSet.getString(columnName) + " | ");

                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void remove(Connection conn, String tableName, int id) {
        try (PreparedStatement statement =
                     conn.prepareStatement(DELETE_QUERY.replace("tableName", tableName));) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getId() {
        System.out.print("Please enter an ID:");
        return ScannerHelper.getInt();
    }

    public static boolean confirmDelete() {
        while (true) {
            System.out.println("Are you sure you want to delete?( Y or N )");
            String data = ScannerHelper.getString();
            if ("Y".equals(data.toUpperCase(Locale.ROOT))) {
                return true;
            } else if ("N".equals(data.toUpperCase(Locale.ROOT))) {
                return false;
            }
        }
    }

 */
}