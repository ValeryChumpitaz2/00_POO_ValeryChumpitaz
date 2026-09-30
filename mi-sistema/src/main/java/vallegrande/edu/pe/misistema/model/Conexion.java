package vallegrande.edu.pe.misistema.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3307/sistema_poo";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }
}
