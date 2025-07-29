package EjerciciosPolimorfismo.SistemaNotificaciones;

public class NotificacionSMS extends Notificacion {
    private String numTelefonico;

    public NotificacionSMS (String mensaje, String numTelefonico) {
        super(mensaje);
        // Validación de que 'numTelefonico' sean numeros
        if (numTelefonico != null && numTelefonico.matches("\\d+")) {
            this.numTelefonico = numTelefonico;
        } else {
            throw new IllegalArgumentException("El número telefónico debe contener solo dígitos.");
        }
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS al '"+ this.numTelefonico +"' con el mensaje: " + this.mensaje);
    }

    public String getNumTelefonico() {
        return this.numTelefonico;
    }
}
