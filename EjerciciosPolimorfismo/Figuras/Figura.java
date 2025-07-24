package EjerciciosPolimorfismo.Figuras;

public class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        System.out.println("Calculo del área no implementado para Figura.");
        return 0.0;
    }

    public void mostrarNombre() {
        System.out.println("Figura: " + this.nombre);
    }
}
