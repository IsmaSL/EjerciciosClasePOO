package EjerciciosInterfaz.DispositivosControlables;

public class Television implements Controlable { // Implementa la interfaz

    private String marca;
    private int volumenActual;
    private final int MAX_VOLUMEN = 100;
    private final int MIN_VOLUMEN = 0;
    
    public Television(String marca, int volumenInicial) {
        this.marca = marca;
        if (volumenInicial >= this.MIN_VOLUMEN && volumenInicial <= this.MAX_VOLUMEN) {
            this.volumenActual = volumenInicial;
        } else {
            this.volumenActual = 20; // valor por defecto
        }
    }

    // Implementación de los métodos de la interfaz
    @Override
    public void encender() {
        System.out.println("Television " + this.marca + " encendida. Volumen: " + this.volumenActual);
    }

    @Override
    public void apagar() {
        System.out.println("Television " + this.marca + " apagada.");
    }

    @Override
    public void subirVolumen() {
        if (this.volumenActual < MAX_VOLUMEN) {
            volumenActual++;
            System.out.println("Subiendo volumen a " + this.volumenActual);
        } else {
            System.out.println("Volumen al nivel máximo: " + this.MAX_VOLUMEN);
        }
    }

    @Override
    public void bajarVolumen() {
        if (this.volumenActual > MIN_VOLUMEN) {
            volumenActual--;
            System.out.println("Bajando volumen a " + this.volumenActual);
        } else {
            System.out.println("Volumen al nivel mínimo: " + this.MIN_VOLUMEN);
        }
    }
}
