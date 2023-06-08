package app4;
//@author MarcoVilera

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {

    private static final String URL = "jdbc:mysql://localhost:3306/crud";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection connect() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo cargar el controlador de MySQL");
        }
        return connection;
    }
}
