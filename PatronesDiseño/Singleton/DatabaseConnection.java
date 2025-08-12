package PatronesDiseño.Singleton;

import java.sql.Connection;
// import java.sql.DriverManager;

public class DatabaseConnection {
    
    private static DatabaseConnection instance; 
    private Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/mi_bd";

    // Constructor privado
    private DatabaseConnection(){
        System.out.println("Simulando conexión a la Base de Datos: " + URL);
        // this.connection = DriverManager.getConnection(URL, "user_db", "password_db");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        System.out.println("Obteniendo conexión a la BD (simulada)...");
        return null;
    }

    public void closeConnection() {
        System.out.println("Cerrando conexión a la BD (simulada)...");
    }
}
