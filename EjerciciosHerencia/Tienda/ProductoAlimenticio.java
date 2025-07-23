package EjerciciosHerencia.Tienda;

public class ProductoAlimenticio extends Producto {
    
    private String fechaCaducidad;

    public ProductoAlimenticio(String codigo, String nombre, double precio, String fechaCaducidad) {
        super(codigo, nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "ProdAlimenticio [Fecha de caducidad= " + fechaCaducidad + ", Producto= " + super.toString() + "]";
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    
}
