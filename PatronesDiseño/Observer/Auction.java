package PatronesDiseño.Observer;

import java.util.ArrayList;
import java.util.List;

// Crear interfaces para el sujeto (emite notificación)
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// Crear interfaces para el observador (recibe la notificación)
interface Observer {
    void update(String item, double newBid);
}

// Clase de usuario que se notifica por email (Observer)
class EmailBidder implements Observer {
    @Override
    public void update(String item, double newBid) {
        System.out.println("Enviando email a EmailBidder: Nueva oferta de " + newBid + " por " + item);
    }
}

// Clase de usuario que se notifica por SMS (Observer)
class SMSBidder implements Observer {
    @Override
    public void update(String item, double newBid) {
        System.out.println("Enviando SMS a SMSBidder: Nueva oferta de " + newBid + " por " + item);
    }
}

// Clase de usuario que se notifica por notificación push (Observer)
class AppBidder implements Observer {
    @Override
    public void update(String item, double newBid) {
        System.out.println("Enviando notificación push: Nueva oferta de " + newBid + " por " + item);
    }
}

// La clase de la subasta con acoplamiento directo a los observadores
public class Auction implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String item;
    private double currentBid;

    public Auction(String item) {
        this.item = item;
        this.currentBid = 0;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(item, currentBid);
        }
    }

    public void placeBid(double newBid) {
        if (newBid > currentBid) {
            this.currentBid = newBid;
            System.out.println("\nNueva oferta de " + newBid + " por " + item);
            // Simplemente llamamos a notificar, sin saber quienes son los observadores
            notifyObservers();
        }
    }
    
    public static void main(String[] args) {
        Auction auction = new Auction("Reloj Antiguo");
        AppBidder notificacionPush = new AppBidder();
        auction.registerObserver(new EmailBidder());
        auction.registerObserver(new SMSBidder());
        auction.registerObserver(notificacionPush);

        auction.placeBid(150.0);
        auction.placeBid(200.0);

        auction.removeObserver(notificacionPush);

        auction.placeBid(250.0); // Ahora no se enviará notificación push
    }
}


/*
 * Problema: La clase Auction depende directamente de las clases EmailBidder y SMSBidder. 
 * Si se necesita añadir un nuevo tipo de notificador (por ejemplo, un AppBidder), 
 * tendríamos que modificar la clase Auction (añadir la nueva dependencia, modificar 
 * el constructor y el método placeBid). Esto viola el principio Open/Closed, ya que 
 * la clase no está cerrada a la modificación.
 */