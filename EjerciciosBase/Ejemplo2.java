package EjerciciosBase;
public class Ejemplo2 {
    static class Libro {
        String titulo;
        String autor;
        int anioPublicacion;
        String isbn;
        boolean disponible;

        public Libro(String tituloLibro, String autorLibro, int anioLibro, String isbnLibro) {
            this.titulo = tituloLibro;
            this.autor = autorLibro;
            this.anioPublicacion = anioLibro;
            this.isbn = isbnLibro;
            this.disponible = true; // Por defecto, el libro está disponible
        }

        // Métodos
        public void prestarLibro() {
            if(this.disponible) {
                this.disponible = false;
                System.out.println(">>> El libro '" + titulo + "' ha sido prestado.");
            } else {
                System.out.println(">>> El libro '" + titulo + "' no está disponible.");
            }
        }

        public void devolverLibro() {
            if(!this.disponible) {
                this.disponible = true;
                System.out.println(">>> El libro '" + titulo + "' ha sido devuelto.");
            } else {
                System.out.println(">>> El libro '" + titulo + "' ya se encuentra en la biblioteca.");
            }
        }

        public void mostrarDetalles() {
            System.out.println("Título: " + this.titulo);
            System.out.println("Autor: " + this.autor);
            System.out.println("Año Pub: " + this.anioPublicacion);
            System.out.println("ISBN: " + this.isbn);
            System.out.println("Estado: " + (this.disponible ? "Disponible" : "Prestado"));
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Gestión de Biblioteca ---\n");

        Libro libro1 = new Libro(
                    "Cien años de soledad", 
                    "Gabriel García Márquez", 
                    1967, 
                    "123456AA");

        Libro libro2 = new Libro(
                    "1984", 
                    "George Orwell", 
                    1949, 
                    "321asf3sdf");

        System.out.println("\n--- Detalles del Libro 1 ---\n");

        libro1.mostrarDetalles();
        libro1.prestarLibro();
        libro1.mostrarDetalles();
        libro1.prestarLibro(); // Intentar prestar un libro ya prestado

        System.out.println("\n--- Detalles del Libro 2 ---\n");
        libro2.mostrarDetalles();
        libro2.devolverLibro(); // Intentar devolver un libro no prestado
        libro2.prestarLibro();
        libro2.mostrarDetalles();
        libro2.devolverLibro();
        libro2.mostrarDetalles();
    }
}
