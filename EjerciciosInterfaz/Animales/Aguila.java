package EjerciciosInterfaz.Animales;

public class Aguila extends Animal implements Volador, Oviparo{

    private double envergaduraAlas;
    private String tipoHuevo;

    //Constructor
    public Aguila(String nombre, int edad, double envergaduraAlas, String tipoHuevo){
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoHuevo = tipoHuevo;
    }

    //Métodos
    @Override
    public void hacerSonido(){
        System.out.println("Sonido del águila");
    }

    @Override
    public void moverse(){
        System.out.println("Águila moviendose: "+ super.getNombre());
    }

    @Override
    public void volar(){
        System.out.println("El Águila "+ super.getNombre() + " está volando");
    }
    
    @Override
    public void aterrizar(){
        System.out.println("El Águila "+ super.getNombre() + "aterrizo");
    }

    @Override
    public void ponerHuevos(){
        System.out.println("El Águila" + super.getNombre() + "pone huevos");
    }

    @Override
    public String getTipoHuevo(){
        return this.tipoHuevo;    
    }

    public double getEnvergaduraAlas(){
        return this.envergaduraAlas;
    }

}