public class Gato extends Animal {
    // Atributo privado
    private boolean tieneGarras;

    // Constructor
    public Gato (String nombre, int edad, boolean tieneGarras) {
        // Llama al constructor de la clase padre (Animal)
        super(nombre, edad);
        this.tieneGarras = tieneGarras;
    }

    // Método específico para el gato
    public void maullar() {
        System.out.println(getNombre() + " está maullando. (Miau!)");
    }

    public boolean getTieneGarras() {
        return this.tieneGarras;
    }
}
