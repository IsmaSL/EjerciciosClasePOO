package Gestores;

// import ModificadoresAcceso.Empleado;
import ModificadoresAcceso.Desarrollador;
import ModificadoresAcceso.Gerente;

public class Gestor {
    public static void main() {
        System.out.println("--- Gestor de empleados (Niveles de Acceso) ---");
        
        // No se pueden hacer instancias a clases abstractas.
        // Empleado empleado = new Empleado("Pedro", 123, 25000.00);

        Desarrollador dev = new Desarrollador("Alan", 10101, 35000, "Python");
        Gerente gerente = new Gerente("Patricia", 101011, 52000, "TI");

        System.out.println("Salario Anual de Desarrollador: $" + dev.calcularSalarioAnual());
        System.out.println("Salario Anual de Gerente: $" + gerente.calcularSalarioAnual());

        // Comprobar restricciones de acceso
        // System.out.println(dev.salario);
        // System.out.println(dev.diasVacaciones);

        dev.mostrarInfo();
        System.out.println("");
    }
}