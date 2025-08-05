package ModificadoresAcceso;

public class Desarrollador extends Empleado {

    private String lenguajeFavorito;    // Acceso privado

    public Desarrollador(String nombre, int id, double salario, String lenguajeFavorito) {
        super(nombre, id, salario);
        this.lenguajeFavorito = lenguajeFavorito;
    }

    // Sobrescritura de un método abstracto
    @Override
    public double calcularSalarioAnual() {
        // Accediendo al atributo protegido 'salario' de la clase padre
        return this.salario * 12;
    }

    public void mostrarInfo() {
        // No se puede acceder a "id" o "nombre" directamente porque son privados
        // System.out.println("ID: " + this.id); // Error por la visibilidad
        // Aquí quería mostrar el nombre y el salario pero el diagrma marca los atributos de la clase padre como privados y no hay un getter para ellos
        // System.out.println(String.format("El desarrollador tiene un salario %d y su lenguaje favorito es %s", salario, lenguajeFavorito));
        System.out.println("Dias de vacaciones disponibles: " + obtenerDiasVacaciones());

        revisarSalario();
    }
}