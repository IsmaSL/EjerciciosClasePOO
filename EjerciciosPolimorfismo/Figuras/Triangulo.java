package EjerciciosPolimorfismo.Figuras;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo() {
        super("Triangulo");
    }

    public Triangulo(double base, double altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    } 

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
