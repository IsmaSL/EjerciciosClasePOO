package EjerciciosHerencia.Agencia;

public class Agencia {
    public static void main(String[] args) {
        Motor motor = new Motor("Gasolina", 150);
        Automovil auto = new Automovil("Toyota", "Corolla", 2020, 4, motor);

        System.out.println(auto);
    }
}
