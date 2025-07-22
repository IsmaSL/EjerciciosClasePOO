package EjerciciosBase;
public class Ejemplo1 {

    // Clase: Es una plantilla o modelo para crear objetos.
    static class Perro {
        // Atributos: Son las características o propiedades de la clase.
        String nombre;
        String raza;
        int edad;

        // Constructor: Es un método especial que se llama al crear un objeto de la clase.
        // Se utiliza para inicializar los atributos del objeto.
        public Perro(String nombrePerro, String razaPerro, int edadPerro){
            // 'this.' se rfiere a los atributos de la clase actual.
            this.nombre = nombrePerro;
            this.raza = razaPerro;
            this.edad = edadPerro;
        }

        // Métodos: son acciones que los objetos de la clase pueden realizar.
        public void ladrar() {
            System.out.println(nombre + " dice: ¡Guau, guau!");
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Raza: " + raza);
            System.out.println("Edad: " + edad + " años");
        }
    }

    public static void main(String[] args) {
        // Objeto: Es una instancia de una clase.
        Perro miPerro = new Perro(
                        "Molly", 
                        "Chihuahua", 
                        2);

        Perro otroPerro = new Perro(
                        "Rex", 
                        "Pastor Alemán", 
                        5);

        System.out.println("Información del perro:---------------------------\n");

        miPerro.mostrarInformacion();
        miPerro.ladrar();

        System.out.println("\nInformación del otro perro:---------------------------\n");
        otroPerro.mostrarInformacion();
        otroPerro.ladrar();
    }
}
