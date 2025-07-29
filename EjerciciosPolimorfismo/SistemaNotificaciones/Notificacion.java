package EjerciciosPolimorfismo.SistemaNotificaciones;

public class Notificacion {
    // Atributos para la clase padre van protegidos "protected - #"
    protected String mensaje;

    // Constructor
    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
    }

    // Método a sobrescribir en subclases
    public void enviar() {
        System.out.println("Enviando notificación genérica: " + this.mensaje);
    }

    // Getter
    public String getMensaje() {
        return this.mensaje;
    }
}
