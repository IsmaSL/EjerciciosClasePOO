package EjerciciosEncapsulamiento.EjercicioAuto;

public class Auto {
    // Atributos: Son privados y solo se pueden acceder dentro de la misma clase
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadActual; // en km/h

    // Constructor
    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadActual = 0.0; // Inicializamos la velocidad en 0
    }

    // Métodos Get
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    // Métodos Set
    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println(">>> ERROR: la Marca no puede estar vacía.");
        }
    }

    // No crearemos los métodos set para modelo y anio porque no necesitamos modificarlos una 
    // vez que el auto ha sido creado.
    // Parte del encapsulamiento es proteger los datos de modificaciones no deseadas.

    // Métodos de comportamiento
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadActual += incremento; // this.velocidadActual = this.velocidadActual + incremento;
            System.out.println(">>> Acelerando... Velocidad actual: " + this.velocidadActual + " km/h.");
        } else {
            System.out.println(">>> ERROR: El incremento de la velocidad debe ser mayor a 0.");
        }
    }

    public void frenar(double decremento) {
        if (decremento > 0) {
            this.velocidadActual -= decremento;
            if (this.velocidadActual < 0) {
                this.velocidadActual = 0; // No podemos tener velocidad negativa
            }
            System.out.println(">>> Frenando... Velocidad actual: " + this.velocidadActual + " km/h.");
        } else {
            System.out.println(">>> ERROR: El decremento de la velocidad debe ser mayor a 0.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Velocidad Actual: " + getVelocidadActual() + " km/h");
    }
}
