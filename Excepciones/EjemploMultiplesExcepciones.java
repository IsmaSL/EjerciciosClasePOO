package Excepciones;

public class EjemploMultiplesExcepciones {
    public static void main(String[] args) {
        try {
            System.out.println("Iniciando simulación de proceso de compra...");
            
            // Paso 1: Simulación de acceso a un array (indice fuera de límites)
            int[] productos = {101, 102};
            // productos[2] = 103;

            // Paso 2: Simulación de un objeto nulo
            String detallePedido = null;
            // System.out.println(detallePedido.length()); // Error calcular el tamaño de algo que no existe.

            // Paso 3: Simulación de división entre 0
            // int precioUnitario = 100 / 0;

            System.out.println("Proceso de compra finalizado!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡ERROR!: El producto no existe.");
            System.out.println("Detalles del error: " + e);
        } catch (NullPointerException e) {
            System.out.println("¡ERROR!: Faltan datos del cliente.");
            System.out.println("Detalles del error: " + e);
        } catch (ArithmeticException e) {
            System.out.println("¡ERROR!: El precio no es válido.");
            System.out.println("Detalles del error: " + e);
        } finally {
            System.out.print("La simulación ha finalizado... recursos liberados.");
        }
    }
}
