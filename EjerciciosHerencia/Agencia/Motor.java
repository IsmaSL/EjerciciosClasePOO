package EjerciciosHerencia.Agencia;

public class Motor {
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "[Tipo= " + tipo + ", Potencia= " + potencia + " CV]";
    }
}
