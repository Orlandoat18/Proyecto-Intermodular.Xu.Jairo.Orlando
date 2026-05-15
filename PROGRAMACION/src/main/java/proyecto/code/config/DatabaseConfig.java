package proyecto.code.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private static final String url = "jdbc:mysql://localhost:3306/bdcentroidiomas";
    private static final String user = "root";
    private static final String pwd = "mysql";

    public static Connection getConnection() throws SQLException {
        System.out.println("Conectado a MYSQL!!");
        return DriverManager.getConnection(url, user, pwd);
    }
}
