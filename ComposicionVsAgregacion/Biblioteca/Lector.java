package ComposicionVsAgregacion.Biblioteca;

public class Lector{

    private String nombre;
    private String IdMembresia;

    public Lector(String nombre, String IdMembresia){
        this.nombre = nombre;
        this.IdMembresia = IdMembresia;
    }

    // El Lector "usa" o "interactua" con la Biblioteca (Agregación)
    public void pedirLibro(Biblioteca biblioteca, Libro libro){
        System.out.println("El lector " + this.nombre + " solicita el libro: " + libro.getTitulo());
        // La lógica de prestar el libro está en la clase Biblioteca
        biblioteca.prestarLibro(libro);
    }
}