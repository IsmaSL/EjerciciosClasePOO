package Excepciones;

import java.io.FileNotFoundException;

public class EjemploThrows {

    public static String conectarServicio(String url) throws FileNotFoundException {
        System.out.println("Intentado conectar a: " + url);

        // Simulación: si la URL contiene "error", lanzamos la excepción
        if (url.contains("error")) {
            // si la conexión falla, se lanza la excepción
            throw new FileNotFoundException("Servicio no encontrado en la URL: " + url);
        }

        return "Conexión exitosa. Datos recibidos";
    }
    
    public static void main(String[] args) {
        
        try {
            String resultado1 = conectarServicio("http://api.productos.com");
            System.out.println(resultado1);

            String resultado2 = conectarServicio("http://api.error.com");
            System.out.println(resultado2);
        } catch (FileNotFoundException e) {
            System.out.println("Ocurrió un error al conectar con el servicio.");
            System.out.println("Causa: " + e.getMessage());
        }
    }
}
