package EjerciciosPolimorfismo.SistemaNotificaciones;

public class NotificacionPush extends Notificacion {
    private String dispositivoId;

    public NotificacionPush (String mensaje, String dispositivoId) {
        super(mensaje);
        this.dispositivoId = dispositivoId;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Push a '"+ this.dispositivoId +"' con el mensaje: " + this.mensaje);
    }

    public String getDispositivoId() {
        return this.dispositivoId;
    }
}
