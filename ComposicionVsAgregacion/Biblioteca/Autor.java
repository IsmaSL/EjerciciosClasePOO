package ComposicionVsAgregacion.Biblioteca;

/************************ OBJETO ***************************************************
 * Clase: Autor
 ************************ DESCRIPCIÓN **********************************************
 * Representa un autor dentro del Sistema de Gestión de una Biblioteca
 *     Autor ggm = new Autor("Gabriel García Márquez", "Mexicano");
 *     ggm.escribirLibro("100 años de soledad", "9780140035247");
 ************************ HISTORIAL DE CAMBIOS *************************************
 * 2025-08-06 - Marco Antonio Ruiz Valdez: Se ha creado la clase.
 */

/**
 * Representa un autor dentro del Sistema de Gestión de Biblioteca
 */
public class Autor {

    private String nombre;          // Nombre del autor
    private String nacionalidad;    // Nacionalidad del autor

    public static String persona = "Juan";
    
    /**
     * Constructor público para instanciar un Autor indicando su nombre y nacinalidad
     */
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    /**
     * Método público para instanciar un nuevo libro con un título, ISBN utilizando este mismo autor
     * 
     * Este método crea un Libro, lo que demuestra la agregación, ya que el Autor no "contiene" el libro,
     * sino que lo "escribe".
     */
    public Libro escribirLibro(String titulo, String isbn) {
        System.out.println("El autor " + this.nombre + " ha escrito el libro \"" + titulo + "\".");
        return new Libro(titulo, this, isbn);
    }

    public String getNombre() {
        return nombre;
    }

    public static String saludo() {
        return "Hola";
    }
}