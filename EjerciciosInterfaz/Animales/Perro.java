package EjerciciosInterfaz.Animales;

public class Perro extends Animal implements Mamifero, Terrestre {

    // Atributos

    private int numPatas;
    private String raza;

    // Constructor

    public Perro(String nombre, int edad, int numPatas, String raza) {
        super(nombre, edad);
        this.numPatas = numPatas;
        this.raza = raza;
    }

    // Implementación de métodos de la clase abstracta Animal

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " está corriendo con sus " + numPatas + " patas.");
    }

    // Implementación de métodos de la interfaz Terrestre

    @Override
    public void caminar() {
        System.out.println(nombre + " está caminando con sus " + numPatas + " patas.");
    }

    @Override
    public void correr(double velocidad) {
        System.out.println(nombre + " está corriendo a " + velocidad + " km/h con sus " + numPatas + " patas.");
    }

    // Implementación de métodos de la interfaz Mamifero

    @Override
    public void amamantar() {
        System.out.println(nombre + " está amamantando a sus cachorros.");
    }

    @Override
    public int getNumeroPatas() {
        System.out.println(nombre + " tiene " + numPatas + " patas.");
        return numPatas;
    }

    // Métodos concretos

    public String getRaza() {
        return raza;
    }
}
