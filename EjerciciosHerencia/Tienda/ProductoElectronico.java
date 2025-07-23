package EjerciciosHerencia.Tienda;

public class ProductoElectronico extends Producto {

    private int garantiaMeses;

    public ProductoElectronico(String codigo, String nombre, double precio, int garantiaMeses) {
        super(codigo, nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        return "ProdElectronico [Garantía (meses)= " + garantiaMeses + ", Producto= " + super.toString() + "]";
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }
    
}
