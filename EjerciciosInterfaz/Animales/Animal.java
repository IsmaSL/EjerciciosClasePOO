package EjerciciosInterfaz.Animales;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /// Getters para los atributos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    /// Métodos comunes para todos los animales
    public void comer(){
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir(){
        System.out.println(nombre + " está durmiendo.");
    }

    /// Métodos abstractos que deben ser implementados por las subclases
    public abstract void hacerSonido();

    public abstract void moverse();
}