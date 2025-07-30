package EjerciciosInterfaz.DispositivosControlables;

// Interfaz: define un contrato de comportamiento
public interface Controlable {
    // public static final String nombre = "Dispositivo";
    // Todos los métodos de la interfaz son implicitamente public abstract
    void encender();
    void apagar();
    void subirVolumen();
    void bajarVolumen();
}
