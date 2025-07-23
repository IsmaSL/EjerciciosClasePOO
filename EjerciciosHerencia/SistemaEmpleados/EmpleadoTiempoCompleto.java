package EjerciciosHerencia.SistemaEmpleados;

public class EmpleadoTiempoCompleto extends Empleado {
    
    // Atributo
    private double bonoAnual;

    // Constructor
    public EmpleadoTiempoCompleto(int idEmpleado, String nombre, double salarioBase, double bonoAnual) {
        super(idEmpleado, nombre, salarioBase);
        this.bonoAnual = bonoAnual;
    }

    // Sobrescritura 
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.bonoAnual;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bono Anual: $" + this.bonoAnual);
    }
}
