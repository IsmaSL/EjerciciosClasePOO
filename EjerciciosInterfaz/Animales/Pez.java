package EjerciciosInterfaz.Animales;

public class Pez extends Animal implements Oviparo, Nadador {
   
    public String tipoAgua;
    public String tipoHuevo;

    public  Pez(String nombre, int edad, String tipoAgua, String tipoHuevo)
    {
        super(nombre, edad);
        this.tipoAgua= tipoAgua;
        this.tipoHuevo= tipoHuevo;
    }

    @Override
    public void hacerSonido()
    {
        System.out.println("hacer sonido");
    }

    @Override
    public void moverse()
    {
        System.out.println("pez moviendo");
    }

    @Override
    public void nadar()
    {
        System.out.println(this.nombre + " el pez, esta nadando");
    }

    @Override
    public void sumergirse(int profundidad)
    {
        System.out.println(this.nombre + " ,el pez, esta a una profundidad de " + profundidad);
    }

    @Override
    public String getTipoHuevo()
    {
        return this.tipoHuevo;
    }

    @Override
    public void ponerHuevos()
    {
        System.out.println(this.nombre + " ,el pez, puso muchos huevos");
    }
    
    public String getTipoAgua()
    {
        return this.tipoAgua;
    }

}