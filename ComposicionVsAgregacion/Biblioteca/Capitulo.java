package ComposicionVsAgregacion.Biblioteca;

/**
 * Nombre de la Clase: capítulo
 * Autor: Alan Adalberto Ortiz Pérez
 * Fecha de Creación: 06-Agosto-2025
 */

public class Capitulo {

    private int numero;             // Número del capítulo
    private String titulo;          // Título del Libro
    private String contenido;       // Contenido del capítulo

    /**
     * Constructor de la clase
     */
    public Capitulo(int numero, String titulo, String contenido){
        this.numero = numero;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    /**
     * Método para mostrar las propiedaes formateadas
     */
    public void mostrarContenido(){
        //System.out.println(String.format("El número del capítulo es : %a  del Libro: %b y su contenido es :\n %c", 
        //this.numero, this.titulo, this.contenido));
        System.out.println("Capítulo " + this.numero + ": " + this.titulo);
    }
}