package EjerciciosHerencia.Tienda;

public class Tienda {
    public static void main(String[] args) {
        // Crear instancias de ProductoAlimenticio y ProductoElectronico
        ProductoAlimenticio producto1 = new ProductoAlimenticio("001", "Leche", 1.5, "2025-12-31");
        ProductoElectronico producto2 = new ProductoElectronico("002", "Televisor", 500.0, 24);

        System.out.println(producto1 + "\n");
        System.out.println(producto2 + "\n");
    }
}
