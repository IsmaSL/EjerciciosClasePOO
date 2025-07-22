package EjerciciosBase.Ejemplo3;

public class GestionEstudiantes {
    public static void main(String[] args) {
        System.out.println("\n--- Sistema de Gestión de Estudiantes ---\n");

        // Crear los objetos de tipo Estudiante
        Estudiante e1 = new Estudiante(
                        "Ana María", 
                        "Valdez", 
                        1, 
                        "TI");

        System.out.println("\n--- Estudiante 1 ---\n");
        e1.mostrarInformacion();
        e1.actualizarPromedio(95);
        e1.mostrarInformacion();
        e1.actualizarPromedio(105);
        e1.mostrarInformacion();
    }
}
