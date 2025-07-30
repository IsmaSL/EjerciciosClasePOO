package EjerciciosAbtraccion.ProcesadorDocumentos;

public abstract class Documento {
    protected String nombreArchivo;
    protected String contenido;

    public Documento(String nombreArchivo, String contenido) {
        this.nombreArchivo = nombreArchivo;
        this.contenido = contenido;
    }

    // Método concreto: tiene implementación y puede ser usado directamente o sobrescrito
    public void mostrarInfo() {
        System.out.println("--- Información del documento ---");
        System.out.println("Nombre Archivo: " + this.nombreArchivo);
        if (this.contenido != null && !this.contenido.isEmpty()) {
            System.out.println("Contenido: " + this.contenido);
        } else {
            System.out.println("Contenido: [VACIO]");
        }
    }

    // Métodos abstractos: no tienen implementación. Las clases DEBEN implementarlos
    public abstract void abrir();
    public abstract void guardar();
}
