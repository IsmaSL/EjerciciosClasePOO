package ComposicionVsAgregacion;

class Persona {
    private String nombre;
    private String telefono;
    private String edad;

    public Persona() {}

    public Persona(String nombre, String telefono, String edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void mostrarDetalles () {
        System.out.println("Nombre: " + this.nombre + " | Edad: " + this.edad + " años");
    }
}

public class Constructores {
    public static void main(String[] args) {
        
        Persona p1 = new Persona();

        p1.setNombre("Raúl");
        p1.setEdad("15");

        Persona p2 = new Persona("Camilo", "272123123", "23");

        p1.setTelefono("272159159");

        p1.mostrarDetalles();
        p2.mostrarDetalles();
    }
}
