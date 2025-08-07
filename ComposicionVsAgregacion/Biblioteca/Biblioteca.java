package ComposicionVsAgregacion.Biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    
    private String nombre;
    private String direccion;
    // Agregación: La Biblioteca "tiene" libros, pero su ciclo de vida
    // no depende de ella
    private List<Libro> librosDisponibles;

    Biblioteca(String nombre, String direccion) {
        this.nombre= nombre;
        this.direccion= direccion;    
        this.librosDisponibles = new ArrayList<>();
    }

    public void agregarLibro(Libro libro)
    {
        this.librosDisponibles.add(libro);
        System.out.println("Se agrego un libro: " + libro.getTitulo());
    }

    public void prestarLibro(Libro libro)
    {
        if (this.librosDisponibles.remove(libro)) {
            System.out.println("Se apresto el libro " + libro.getTitulo());
        } else {
            System.out.println("El libro solicitado (" + libro.getTitulo() + ") no está disponible.");
        }
    }
}