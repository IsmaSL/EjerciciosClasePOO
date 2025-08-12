package PatronesDiseño.Singleton;

import java.sql.Connection;

public class Main {
    
    public static void main(String[] args) {
        // Intento 1: Obtener la instancia de la conexión
        System.out.println("--- Intento 1 ---");
        DatabaseConnection dbCon1 = DatabaseConnection.getInstance();
        System.out.println("Hash de la instancia 1: " + dbCon1.hashCode());

        // Intento 2: volver a obtener la instancia
        System.out.println("--- Intento 2 ---");
        DatabaseConnection dbCon2 = DatabaseConnection.getInstance();
        System.out.println("Hash de la instancia 2: " + dbCon2.hashCode());

        // Verificar si las dos instancias son la misma
        if (dbCon1 == dbCon2) {
            System.out.println("Las instancias son las mismas");
        } else {
            System.out.println("Las instancias son diferentes");
        }

        System.out.println("\nSimulando la operación de conexión...");
        Connection connection = dbCon1.getConnection();

        dbCon1.closeConnection();

        // System.out.println("");
    }
}
