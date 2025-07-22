package EjerciciosEncapsulamiento.EjercicioAuto;

public class EncapsuladoAuto {
    public static void main(String[] args) {
            
        System.out.println("\n--- Gestión de Autos (Encapsulamiento) ---");
        
        Auto auto = new Auto("Dodge", "Attitude", 2025);

        System.out.println("\n--- Estado inicial del auto...");
        auto.mostrarEstado();

        // Accediendo y modificando mediante getters y setters
        System.out.println("\n+++ Marca del auto: " + auto.getMarca());
        auto.setMarca("Honda");
        System.out.println("\n+++ Nueva marca del auto: " + auto.getMarca());
        auto.setMarca(null); // Intento de establecer una marca nula o "" vacía

        auto.acelerar(50);
        auto.acelerar(30);
        auto.frenar(20);
        auto.frenar(70);

        System.out.println("\n--- Estado final del auto...");
        auto.mostrarEstado();
    }
}
