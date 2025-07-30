package EjerciciosInterfaz.DispositivosControlables;

// Quieres compartir código base (atributos o métodos comunes) --> Clase abstracta
// Si necesitan multiples comportamientos que pueden venir de distintos orígenes --> interfaz

public class ControlUniversal {
    public static void main(String[] args) {
        System.out.println("--- Control Remoto Universal ---");

        Television samsung = new Television("SAMSUNG", 2);

        samsung.encender();
        samsung.bajarVolumen();
        samsung.bajarVolumen();
        samsung.bajarVolumen();
        samsung.apagar();
        
    }
}
