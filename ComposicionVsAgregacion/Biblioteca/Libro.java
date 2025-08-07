package ComposicionVsAgregacion.Biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase | Libro
 */
public class Libro {

    private String titulo;
    private Autor autor;
    private String isbn;
    // Composición: El Libro "contiene" sus Capítulos.
    // Si el Libro desaparece, sus Capítulos tmabien lo hacen (en este contexto).
    public List<Capitulo> capitulos;

    /**
     * Método | Constructor
     */
    public Libro(String titulo, Autor autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.capitulos = new ArrayList<>();
        // Los capitulos se crean y se gestionan internamente, 
        // desmotrando composición.
        crearCapitulosEjemplo();
    }

    private void crearCapitulosEjemplo() {
        this.capitulos.add(new Capitulo(1, "ABC", "Hola mundo..."));
        this.capitulos.add(new Capitulo(2, "123", "Hola clase..."));
        this.capitulos.add(new Capitulo(3, "1AS", "Hola gente..."));
        System.out.println("Libro \"" + this.titulo + "\" creado con " + this.capitulos.size() + " capítulos.");
    }

    /**
     * Método | Mostrar información del libro
     */
    public void mostrarInfo() {
        System.out.println("Mostrando información del libro: " + this.titulo +
                            " | autor: " + this.autor.getNombre() + " | ISBN: " + this.isbn);;
    }

    public String getTitulo() {
        return titulo;
    }

}