package EjerciciosPolimorfismo.SistemaNotificaciones;

import java.util.ArrayList;
import java.util.List;

public class SistemaNotificaciones {
    public static void main(String[] args) {

        String mensaje = "Tu pedido 123 está en camino!";

        System.out.println("--- Gestor de notificaciones ---");

        List<Notificacion> notificaciones = new ArrayList<>();

        // Llenar la lista con instancias
        notificaciones.add(new NotificacionEmail(mensaje, "isma@gmail.com"));
        notificaciones.add(new NotificacionSMS(mensaje, "2721112233"));
        notificaciones.add(new NotificacionPush(mensaje, "32132321"));

        System.out.println("\nProcesando envio de notificaciones");

        // Iterar sobre la lista utilizando un for y al acceder a cada objeto, llamaremos al método enviar();
        for (Notificacion notif : notificaciones) {
            notif.enviar();
            System.out.println("-----------------------");
        }

        NotificacionSMS sms = new NotificacionSMS("Hola, este es un SMS", "272i112233");
        sms.enviar();
    }
}
