package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/users";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";

    public static Connection getdbConnection() {
        Connection connection;

        try {
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;

    }
}
