package EjerciciosPolimorfismo;
public class Ejemplo1 {

    static class Persona {

        public void saludar() {
            System.out.println("Hola extraño");
        }

        public void saludar(String nombre) {
            System.out.println("Hola " + nombre);
        }
    }

    public static void main(String[] args) {

        Persona p1 = new Persona();

        p1.saludar();
        p1.saludar("Isma");
        // System.out.println("¡Hola, mundo!");
    }
}
