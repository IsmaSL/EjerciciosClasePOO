package EjerciciosInterfaz.Animales;

import java.util.List;
import java.util.ArrayList;

public class ReinoAnimal {
    public static void main(String[] args) {

        System.out.println("--- Demostración del Reino Animal con Clases Abstractas e Interfaces ---");

        // Polimorfismo con la clase abstracta Animal
        List<Animal> animalesGeneral = new ArrayList<>();
        animalesGeneral.add(new Perro("Firulais", 5, 4, "Labrador"));
        animalesGeneral.add(new Pez("Nemo", 1, "Salada", "Esférico"));
        animalesGeneral.add(new Aguila("Águila Real", 10, 2.2, "Ovalado"));
        animalesGeneral.add(new Pato("Donald", 3, "Blanco", "Blanco"));

        System.out.println("\n--- Comportamientos Generales de Todos los Animales ---");
        for (Animal animal : animalesGeneral) {
            System.out.println("\n--- " + animal.getNombre() + " ---");
            animal.comer();
            animal.dormir();
            animal.hacerSonido();
            animal.moverse();
        }

        System.out.println("\n--- Comportamientos Específicos por Interfaces ---");

        // Polimorfismo con la interfaz Mamifero
        List<Mamifero> mamiferos = new ArrayList<>();
        mamiferos.add(new Perro("Bobby", 4, 4, "Poodle"));
        // mamiferos.add(new Pez("Goldie", 2, "Dulce", "Pequeño")); // Error: Pez no es un Mamifero

        System.out.println("\n--- Mamíferos ---");
        for (Mamifero mamifero : mamiferos) {
            // Se puede hacer casting si necesitamos acceder a atributos específicos de la clase concreta
            // Por ejemplo, para obtener el nombre del Perro que está referenciado como Mamifero
            if (mamifero instanceof Animal) { // Todos los mamíferos en este diseño también son Animales
                System.out.println("Nombre: " + ((Animal) mamifero).getNombre() + ", Patas: " + mamifero.getNumeroPatas());
            }
            mamifero.amamantar();
        }

        // Polimorfismo con la interfaz Oviparo
        List<Oviparo> oviparos = new ArrayList<>();
        oviparos.add(new Pez("Dory", 2, "Salada", "Transparente"));
        oviparos.add(new Aguila("Gilda", 7, 2.5, "Grande y blanco"));
        oviparos.add(new Pato("Daisy", 4, "Marrón", "Mediano"));

        System.out.println("\n--- Ovíparos ---");
        for (Oviparo oviparo : oviparos) {
            if (oviparo instanceof Animal) {
                System.out.println("Nombre: " + ((Animal) oviparo).getNombre() + ", Tipo de huevo: " + oviparo.getTipoHuevo());
            }
            oviparo.ponerHuevos();
        }

        // Demostrando la combinación de interfaces (el Pato es muy versátil)
        System.out.println("\n--- El Pato Versátil ---");
        Pato patito = new Pato("Lucas", 2, "Amarillo", "Pequeño");
        patito.hacerSonido();
        patito.volar();
        patito.nadar();
        patito.moverse(); // Aunque Pato no implementa Terrestre, su 'moverse' es genérico.
                          // Si quisiéramos que tuviera métodos de caminar y correr específicos
                          // de Terrestre, el Pato también debería implementar Terrestre.
                          // Dejarlo sin Terrestre aquí es intencional para mostrar que no todos los 'Animal' tienen todas las interfaces.
        patito.ponerHuevos();
        patito.aterrizar();
        patito.sumergirse(2);


        System.out.println("\n--- Demostración de Capacidades Cruzadas ---");
        List<Nadador> animalesQueNadan = new ArrayList<>();
        animalesQueNadan.add(new Pez("Wally", 1, "Río", "Gelatinoso"));
        animalesQueNadan.add(new Pato("Quack", 1, "Verde", "Pequeño"));

        for(Nadador nadador : animalesQueNadan) {
            if (nadador instanceof Animal) {
                System.out.print("El " + ((Animal)nadador).getNombre() + ": ");
            }
            nadador.nadar();
        }
    }
}
