package EjerciciosPolimorfismo.SistemaNotificaciones;

public class NotificacionEmail extends Notificacion {
    private String direccionEmail;

    public NotificacionEmail (String mensaje, String direccionEmail) {
        super(mensaje);
        this.direccionEmail = direccionEmail;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Email a '"+ this.direccionEmail +"' con el mensaje: " + this.mensaje);
    }

    public String getEmail() {
        return this.direccionEmail;
    }
}
