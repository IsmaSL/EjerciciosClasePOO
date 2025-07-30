package EjerciciosAbtraccion.ProcesadorDocumentos;

public class DocumentoPDF extends Documento {

    private int numPaginas;

    public DocumentoPDF(String nombreArchivo, String contenido, int numPaginas) {
        super(nombreArchivo, contenido);
        this.numPaginas = numPaginas;
    }

    // Implementacíón obligatoria del método abstracto abrir();
    @Override
    public void abrir() {
        System.out.println("Abriendo documento PDF: " + this.nombreArchivo + " con " + this.numPaginas + " páginas.");
    }

    // Implementacíón obligatoria del método abstracto guardar();
    @Override
    public void guardar() {
        System.out.println("Guardando contenido en: " + this.nombreArchivo + ".pdf");
    }
}
