package EjerciciosPolimorfismo.Figuras;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    
    public static void main(String[] args) {
        System.out.println("\n--- Calculadora de Áreas Polimórficas ---");

        // Crear una lista de tipo Figura, que puede contener objetos de sus subclases (clases hijas)
        List<Figura> figuras = new ArrayList<>();

        // Agregar objetos/instancias a la lista
        figuras.add(new Circulo(5.0));
        figuras.add(new Rectangulo(20, 10));
        figuras.add(new Triangulo(5, 8));
        figuras.add(new Circulo(12));

        System.out.println("\n>>> Calculando áreas de las figuras...");
        for (Figura figura : figuras) {
            figura.mostrarNombre();
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("-----------------------------");
        }

        Triangulo triangulo = new Triangulo(3, 4);

        Triangulo triangulo2 = new Triangulo();
        triangulo2.setBase(5);
        triangulo2.setAltura(16);

        System.out.println("Área T1: " + triangulo.calcularArea());
        System.out.println("Área T2: " + triangulo2.calcularArea());
    }
}
