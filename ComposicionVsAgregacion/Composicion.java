package ComposicionVsAgregacion;

// Car <x>--- Engine

class Engine {
    public void start() {
        System.out.println("Motor encendido...");
    }
}

class Car {
    private Engine engine;

    public Car() {
        // El motor se crea y vive solo dentro del auto/carro/coche
        this.engine = new Engine();
    }

    public void startCar() {
        this.engine.start();
        System.out.println("Coche encendido...");
    }
}

public class Composicion {

    public static void main(String[] args) {
        Car carrito = new Car();
        carrito.startCar();

        Car carrito2 = new Car();
        carrito2.startCar();
    }
}
