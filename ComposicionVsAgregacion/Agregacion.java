package ComposicionVsAgregacion;

import java.util.List;
import java.util.ArrayList;

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Department {
    private String name;
    private List<Employee> employes;

    public Department(String name, List<Employee> employes) {
        this.name = name;
        this.employes = employes;
    }

    public void showEmployess() {
        System.out.println("Empleados en " + this.name + ":");
        for (Employee e : employes) {
            System.out.println("- " + e.name);
        }
    }
}

public class Agregacion {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Fernando");
        Employee emp2 = new Employee("Marco");

        List<Employee> empleados = new ArrayList<>();

        empleados.add(emp1);
        empleados.add(emp2);

        System.out.println(emp1.getName());
        System.out.println(emp2.getName());

        // Department depto = new Department("RH", empleados);
        // depto.showEmployess();

        // Department depto2 = new Department("TI", empleados);
        // depto2.showEmployess();
    }
}
