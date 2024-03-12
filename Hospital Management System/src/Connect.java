import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    static final String URL = "jdbc:mysql://localhost:3306/hospitalms";
    static final String USERNAME = "root";
    static final String PASSWORD = "Evrensel118Ga";

    public static Connection ConnectDB() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }
        return connection;
    }

}