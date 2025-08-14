package PatronesDiseño.Strategy;

// Interfaz para las estrategias de descuento
interface DiscountStrategy {
    double applyDiscount(double totalAmount);
}

// Clases concretas de estrategia de descuento
class SeasonalDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.90; // 10% de descuento
    }
}

class VIPDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.80; // 20% de descuento
    }
}

class StudentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.85; // 15% de descuento
    }
}

class EmployeeDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.75; // 25% de descuento
    }
}

// La clase que maneja el carrito de compras
public class ShoppingCart {
    private double totalAmount;
    private DiscountStrategy discountStrategy;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Método para establecer la estrategia en tiempo de ejecición
    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }

    // El cálculo del descuento desacoplado
    public double getFinalPrice() {
        if (discountStrategy != null) {
            // El carrito delega la lógica de descuento a la estrategia
            return discountStrategy.applyDiscount(totalAmount);
        }
        // Si no hay descuento aplicable
        return totalAmount;
    }
    
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(100.0);

        // Establecer la estrategia en tiempo de ejecución
        cart.setDiscountStrategy(new SeasonalDiscount());
        System.out.println("Precio final (temporada): " + cart.getFinalPrice());

        cart.setDiscountStrategy(new VIPDiscount());
        System.out.println("Precio final (VIP): " + cart.getFinalPrice());

        cart.setDiscountStrategy(new StudentDiscount());
        System.out.println("Precio final (estudiante): " + cart.getFinalPrice());

        cart.setDiscountStrategy(new EmployeeDiscount());
        System.out.println("Precio final (empleado): " + cart.getFinalPrice());

    }
}


/*
 * Problema: El método calculateDiscountedPrice de la clase ShoppingCart tiene 
 * un conocimiento directo de cada tipo de descuento. Si la empresa decide 
 * agregar un descuento para estudiantes o un descuento por fidelidad, 
 * tendríamos que modificar este método, añadiendo más else if. Esto 
 * viola el principio Open/Closed, ya que la clase no está cerrada 
 * a la modificación.
*/