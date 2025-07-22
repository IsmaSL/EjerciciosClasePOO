public class Animal {
    // Atributos (protegidos - #) -> Accesibles dentro de la misma clase,
    // paquete y por subclases.
    protected String nombre;
    protected int edad;
    
    // Constructor de la clase Animal
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos públicos
    public void comer() {
        System.out.println(this.nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(this.nombre + " está durmiendo.");
    }

    // Get para nombre
    public String getNombre() {
        return nombre;
    }
}