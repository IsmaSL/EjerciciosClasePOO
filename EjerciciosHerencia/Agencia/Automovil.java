package EjerciciosHerencia.Agencia;

public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private Motor motor;

    public Automovil(String marca, String modelo, int anio, int numeroPuertas, Motor motor) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return super.toString() + ", [Número de Puertas= " + numeroPuertas + ", Motor= " + motor + "]";
    }
    
}
