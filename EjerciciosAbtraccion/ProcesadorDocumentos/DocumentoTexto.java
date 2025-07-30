package EjerciciosAbtraccion.ProcesadorDocumentos;

public class DocumentoTexto extends Documento {
    
    public DocumentoTexto(String nombreArchivo, String contenido) {
        super(nombreArchivo, contenido);
    }

    // Implementacíón obligatoria del método abstracto abrir();
    @Override
    public void abrir() {
        System.out.println("Abriendo documento de texto: " + this.nombreArchivo);
        System.out.println("Contenido: " + this.contenido);
    }

    // Implementacíón obligatoria del método abstracto guardar();
    @Override
    public void guardar() {
        System.out.println("Guardando contenido en: " + this.nombreArchivo + ".txt");
    }
}
