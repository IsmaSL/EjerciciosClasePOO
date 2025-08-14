package EjerciciosHerencia.Granja;

public class Perro extends Animal{
    // Atributo privado (Solo son accesibles dentro de la misma clase)
    private String raza;

    // Constructor de la clase Perro
    public Perro(String nombre, int edad, String raza) {
        // Llamar al constructor de la superclase (Animal)
        super(nombre, edad);
        this.raza = raza;
    }

    // Método específico para el perro
    public void ladrar() {
        System.out.println(getNombre() + " de la raza " + this.raza + " está ladrando. (Guau Guau!)");
    }
}
