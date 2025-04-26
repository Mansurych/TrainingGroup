
import org.postgresql.Driver;
import util.ConnectionManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String USERNAME = "postgres";
        String URL = "jdbc:postgresql://localhost:5432/PhysicalEducation";
        String PASSWORD = "030721";
        Connection connection;

        Class<Driver> driverClass = Driver.class;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println(connection.getTransactionIsolation());
        } catch (SQLException e ) {
            System.out.println( e );
        };

//        try ( connection = ConnectionManager.open()) {
//            System.out.println( connection.getTransactionIsolation());
//        }
    }
}
