package EjerciciosInterfaz.Animales;

public class Pato extends Animal implements Oviparo, Nadador, Volador {
    private String colorPlumaje;
    private String tipoHuevo;

    public Pato(String nombre, int edad, String colorPlumaje, String tipoHuevo) {
        super(nombre, edad);
        this.colorPlumaje = colorPlumaje;
        this.tipoHuevo = tipoHuevo;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace cuak cuak!");
    }

    @Override
    public void moverse() {
        System.out.println(String.format("El pato %s se ha movido.", super.getNombre()));
    }

    @Override
    public void ponerHuevos() {
        System.out.println(String.format("El pato %s ha puesto un huevo.", super.getNombre()));
    }

    @Override
    public String getTipoHuevo() {
        return this.tipoHuevo;
    }

    @Override
    public void volar() {
        System.out.println(String.format("El pato %s ha volado", super.getNombre()));
    }

    @Override
    public void aterrizar() {
        System.out.println(String.format("El pato %s ha aterrizado", super.getNombre()));
    }

    @Override
    public void nadar() {
        System.out.println(String.format("El pato %s está nadando", super.getNombre()));
    }

    @Override
    public void sumergirse(int profundidad) {
        System.out.println(String.format("El pato %s ese ha sumergido %d metros", super.getNombre(), profundidad));
    }

    public String getColorPlumaje() {
        return this.colorPlumaje;
    }

}