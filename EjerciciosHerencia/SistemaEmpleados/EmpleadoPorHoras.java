package EjerciciosHerencia.SistemaEmpleados;

public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(int idEmpleado, String nombre, double salarioBase, double tarifaHora, int horasTrabajadas) {
        super(idEmpleado, nombre, salarioBase);
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Sobrescritura 
    @Override
    public double calcularSalario() {
        return this.tarifaHora * this.horasTrabajadas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tarifa por Hora: $" + this.tarifaHora);
        System.out.println("Horas Trabajadas: " + this.horasTrabajadas + "hr.");
    }
}
