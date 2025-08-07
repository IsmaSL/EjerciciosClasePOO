package ComposicionVsAgregacion.Biblioteca;

import java.util.List;

public class GestorBiblioteca {
    public static void main(String[] args) {
        // System.out.println(Autor.saludo());
        // System.out.println(Autor.persona);
        System.out.println("\n--- Demostración de Composición y Agregación ---\n");

        // 1. Demostrar Agregación entre Autor y Libro
        Autor garciaMarquez = new Autor("Gabriel García Márquez", "Colombiana");
        Libro cienAnios = garciaMarquez.escribirLibro("Cien Años de Soledad", "3135sd32151asd");

        // 2. Demostrar Agregación entre Biblioteca y Libro
        Biblioteca bibliotecaPublica = new Biblioteca("Biblioteca Municipal", "Calle Falsa #123");
        bibliotecaPublica.agregarLibro(cienAnios);

        // 3. El ciclo de vida de los libros es independiente de la bibliteca
        //  Si la biblioteca cierra, los libros siguen existiendo
        bibliotecaPublica = null;
        System.out.println("\nLa Biblioteca ha cerrado, pero los libros aún existen");
        cienAnios.mostrarInfo();

        // System.out.println("\nEl autor se ha borrado...");
        // garciaMarquez = null;
        // cienAnios.mostrarInfo();

        System.out.println("\n--- Nuevo escenario de Composición y Agregación ---\n");
        // Reiniciar objeto de biblioteca
        bibliotecaPublica = new Biblioteca("Biblioteca Nacional", "Avenida Siempre Viva #742");

        Lector ariel = new Lector("Ariel", "130456");

        Autor tolkien = new Autor("J.R.R. Tolkien", "Británica");
        Libro elHobbit = new Libro("El Hobbit", tolkien, "12312");

        bibliotecaPublica.agregarLibro(elHobbit);
        bibliotecaPublica.agregarLibro(cienAnios);

        // El lector solicita un libro (Agregación)
        ariel.pedirLibro(bibliotecaPublica, elHobbit);

        List<Capitulo> capitulos = elHobbit.capitulos;

        for (Capitulo capitulo : capitulos) {
            capitulo.mostrarContenido();
        }

        // Un libro es una composición de Capítulos
        // Si el libro desaparece, sus capítulos también lo hacen
        elHobbit = null;

        System.out.println("\nEl libro 'El Hobbit' ha sido eliminado, sus capítulos ya no existen.");

        // Intentar acceder a los capítulos después de eliminar el libro
        // Esto no es posible, ya que los capítulos son parte del libro y no existen independientemente
        // List<Capitulo> capitulos2 = elHobbit.capitulos;
        // for (Capitulo capitulo : capitulos) {
        //     capitulo.mostrarContenido(); // Esto causaría un NullPointerException
        // }
    }
}
