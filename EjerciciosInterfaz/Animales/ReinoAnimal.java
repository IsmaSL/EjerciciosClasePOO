package EjerciciosInterfaz.Animales;

public class ReinoAnimal {
    public static void main(String[] args) {
        Pato patito = new Pato("Donald", 3, "Blanco", "Blanco");

        patito.comer();
        patito.dormir();
        patito.hacerSonido();
        patito.moverse();
        System.out.println(patito.getTipoHuevo());
    }
}
