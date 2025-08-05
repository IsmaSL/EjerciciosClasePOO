package ModificadoresAcceso;

public class Gerente extends Empleado{

    private String departamento;
    protected double presupuesto;

    public Gerente(String nombre, int id, double salario, String departamento){
        super(nombre, id, salario);
        this.departamento = departamento;
        this.presupuesto = 0.0;
    }

    @Override
    public double calcularSalarioAnual(){
       return this.salario * 12 + (this.presupuesto * 0.1);
    }
}