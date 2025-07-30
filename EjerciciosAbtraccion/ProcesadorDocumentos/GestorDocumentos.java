package EjerciciosAbtraccion.ProcesadorDocumentos;

import java.util.ArrayList;
import java.util.List;

public class GestorDocumentos {
    public static void main(String[] args) {
        System.out.println("--- Gestor de Documentos ---");

        List<Documento> documentos = new ArrayList<>();

        documentos.add(new DocumentoTexto("Carta", "Estimando cliente, le informamos..."));
        documentos.add(new DocumentoPDF("Tesis", "Este trabajo académico...", 120));

        System.out.println("\n>>> Procesando documentos...");

        for (Documento doc : documentos) {
            // doc.mostrarInfo();  // Método concreto (heredado)
            doc.abrir();        // Método abstracto
            doc.guardar();      // Método abstracto
            System.out.println("---------------------");
        }

        // No se pueden crear instancias a la clase abstracta
        // Documento docc = new Documento("", "");
    }
}
