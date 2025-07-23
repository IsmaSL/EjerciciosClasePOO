package EjerciciosHerencia.SistemaEmpleados;

public class Empleado {
    // Atributos
    protected int idEmpleado;
    protected String nombre;
    protected double salarioBase;

    // Constructor
    public Empleado(int idEmpleado, String nombre, double salarioBase) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método que será sobrescrito (override) en las subclases
    public double calcularSalario() {
        return this.salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + this.idEmpleado);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Salario Base: $" + this.salarioBase);
    }
}