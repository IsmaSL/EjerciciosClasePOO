package EjerciciosHerencia.SistemaEmpleados;

public class GestionPersonal {
    public static void main(String[] args) {
        System.out.println("\n--- Sistema de Gestión de Personal ---");

        // Se crean las instancias
        EmpleadoTiempoCompleto empTC = new EmpleadoTiempoCompleto(
                                                1, 
                                                "Alan ...", 
                                                35000.50, 
                                                25000);

        EmpleadoPorHoras empPH = new EmpleadoPorHoras(
                                                2, 
                                                "Karina ...", 
                                                25000, 
                                                250, 
                                                160);

        System.out.println("\n>>> Información del Empleado de Tiempo Completo");
        empTC.mostrarInfo();
        System.out.println("\n--> Gana... $" + empTC.calcularSalario());

        System.out.println("\n>>> Información del Empleado por Horas");
        empPH.mostrarInfo();
        System.out.println("\n--> Gana... $" + empPH.calcularSalario());
    }
}
