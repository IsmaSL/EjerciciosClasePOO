package PatronesDiseño.FactoryMethod;

// Interfaz para todos los tipos de notificación
interface Notificacion {
    void enviar(String mensaje);
}

// Implementación de la notificación por email
class NotificacionEmail implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("\nEnviando email: " + mensaje);
    }
}

// *** Implementación de las nuevas clases de notificación
class NotificacionSMS implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("\nEnviando SMS: " + mensaje);
    }
}

class NotificacionPush implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("\nEnviando push: " + mensaje);
    }
}

// *** Crear una clase dedicada a la creación de objetos (esta es la pieza clave del patron);
// La fábrica de notificaciones
class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo) {
        if ("email".equalsIgnoreCase(tipo)) {
            return new NotificacionEmail();
        } else if ("sms".equalsIgnoreCase(tipo)) {
            return new NotificacionSMS();
        } else if ("push".equalsIgnoreCase(tipo)) {
            return new NotificacionPush();
        } else {
            throw new IllegalArgumentException("Tipo de notificación no soportado.");
        }
    }
}

public class SistemaNotificaciones {
    public void notificarUsuario(String tipo, String mensaje) {
        // *** Ahora el cliente delega la creación a la fábrica
        NotificacionFactory factory = new NotificacionFactory();
        Notificacion notificacion = factory.crearNotificacion(tipo);

        notificacion.enviar(mensaje);
    }

    public static void main(String[] args) {
        SistemaNotificaciones sistema = new SistemaNotificaciones();
        sistema.notificarUsuario("email", "Hola, bienvenido a la plataforma!");
        sistema.notificarUsuario("sms", "Hola, bienvenido a la plataforma!");
        sistema.notificarUsuario("push", "Hola, bienvenido a la plataforma!");
    }
}


/* 
 * Problema: En el método notificarUsuario, la creación de objetos Notificacion está directamente 
 * acoplada a la clase SistemaNotificaciones. Si más adelante necesitamos agregar NotificacionSMS 
 * o NotificacionPush, tendremos que modificar este método, lo que va en contra del principio 
 * Open/Closed (abierto a la extensión, cerrado a la modificación).
 */