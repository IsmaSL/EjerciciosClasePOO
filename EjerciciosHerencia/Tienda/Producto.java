package EjerciciosHerencia.Tienda;

public class Producto {
    protected String codigo;
    protected String nombre;
    protected double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "[Código= " + this.codigo + ", Nombre= " + this.nombre + ", Precio= $" + this.precio + "]";
    }
}
