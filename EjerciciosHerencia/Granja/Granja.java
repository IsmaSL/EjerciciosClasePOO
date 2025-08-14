package EjerciciosHerencia.Granja;

public class Granja {
    public static void main(String[] args) {
        System.out.println("\n--- Animales de la Granja ---");

        // Crear instancias (objetos)
        Perro molly = new Perro("Molly", 2, "Chihuahua");
        Gato garfield = new Gato("Garfield", 7, true);

        System.out.println("\n--- Comportamiento del perro ---");
        molly.comer(); // Método Heredado
        molly.dormir(); // Método Heredado
        molly.ladrar(); // Método específico de Perro

        System.out.println("\n--- Comportamiento del gato ---");
        garfield.comer(); // Método Heredado
        garfield.dormir(); // Método Heredado
        garfield.maullar(); // Método específico de Gato
        System.out.println(garfield.getNombre() + " tiene garras?: " + garfield.getTieneGarras());
    }
}
