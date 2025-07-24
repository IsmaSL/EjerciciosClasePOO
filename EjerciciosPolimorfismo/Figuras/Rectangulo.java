package EjerciciosPolimorfismo.Figuras;

public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        super("Rectangulo");
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    public double getAncho() {
        return this.ancho;
    }

    public double getAlto() {
        return this.alto;
    }
}
