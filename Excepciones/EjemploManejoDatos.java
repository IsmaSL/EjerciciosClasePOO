package Excepciones;

import java.util.Scanner;

public class EjemploManejoDatos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Por favor, ingresa un número entero: ");
            String input = scanner.nextLine();

            int numero = Integer.parseInt(input);
            System.out.println("El numero ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("¡ERROR!: La entrada del número no es válida.");
            System.out.println("Detalles del error: " + e);
        } finally {
            scanner.close();
            System.out.println("Operación finalizada.");
        }
    }
}
