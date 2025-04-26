package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {
    private static final String USERNAME = "postgres";
    private static final String URL = "jdbc:postgresql://localhost:5432/PhysicalEducation";
    private static final String PASSWORD = "030721";

    private ConnectionManager() {
    }

    public static Connection open(){
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    } catch (SQLException e) {
        throw new RuntimeException(e);
        }
    }

}
