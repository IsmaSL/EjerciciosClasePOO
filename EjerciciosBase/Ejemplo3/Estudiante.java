package EjerciciosBase.Ejemplo3;

public class Estudiante {
    // Atributos
    String nombre;
    String apellidos;
    int idEstudiante;
    String carrera;
    double promedio;

    // Constructor
    public Estudiante(String nombre, String apellidos, int idEstudiante, String carrera) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
        this.promedio = 0.0; // Inicializamos el promedio en 0
    }

    // Métodos
    public void actualizarPromedio(double nuevoPromedio) {
        if (nuevoPromedio >= 0 && nuevoPromedio <= 100) { // Simple validación del promedio
            this.promedio = nuevoPromedio;
            System.out.println(">>> Promedio de " + this.nombre + " actualizado a " + this.promedio);
        } else {
            System.out.println(">>> La nota ingresada no es válida.");
        }
    }


    public void mostrarInformacion() {
        System.out.println("ID: " + this.idEstudiante);
        System.out.println("Nombre Completo: " + this.nombre + " " + this.apellidos);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Promedio: " + this.promedio);
    }
}
