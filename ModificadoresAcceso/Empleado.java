package ModificadoresAcceso;

public abstract class Empleado{
    private String nombre;      // Acceso solo dentro de esta clase
    private int id;             // Acceso solo dentro de esta clase
    protected double salario;   // Acceso en esta clase y en las subclases
    int diasVacaciones = 20;    // Acceso default (sin modificador), en la misma clase y paquete

    // Constructor público: accesible desde cualquier lugar
    public Empleado(String nombre, int id, double salario){
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    // Método público
    public abstract double calcularSalarioAnual();

    // Método protegido
    protected void revisarSalario() {
        System.out.println("Revisando salario de " + this.nombre);
    }

    // Método default
    int obtenerDiasVacaciones() {
        return this.diasVacaciones;
    }

    // Método private
    private int obtenerID()
    {
        return this.id;
    };

}