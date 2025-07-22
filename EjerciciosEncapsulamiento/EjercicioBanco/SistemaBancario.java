package EjerciciosEncapsulamiento.EjercicioBanco;

public class SistemaBancario {
    
    static class CuentaBancaria {
        // Atributos
        private String numeroCuenta;
        private String nombreTitular;
        private double saldo; // Este es el atributo más sensible que vamos a proteger

        // Constuctor
        public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldoInicial) {
            this.numeroCuenta = numeroCuenta;
            this.nombreTitular = nombreTitular;

            if (saldoInicial >= 0) {
                this.saldo = saldoInicial;
            } else {
                this.saldo = 0;
                System.out.println("--- WARNING: El saldo inicial no puede ser negativo.");
            }
        }

        // Métodos Getter
        public String getNumeroCuenta() {
            return numeroCuenta;
        }

        public String getNombreTitular() {
            return nombreTitular;
        }

        // Podemos leer el saldo, pero no lo podemos modificar directamente
        public double getSaldo() {
            return saldo;
        }

        // Métodos para operar con el saldo
        public void depositar(double cantidad) {
            if (cantidad > 0) {
                this.saldo += cantidad;
                System.out.println(">>> INFO: Depósito exitoso! Nuevo saldo: $" + this.saldo);
            } else {
                System.out.println("--- ERROR: La cantidad a depositar debe ser positiva.");
            }
        }

        public void retirar(double cantidad) {
            if (cantidad > 0) {
                if (this.saldo >= cantidad) {
                    this.saldo -= cantidad;
                    System.out.println(">>> INFO: Retiro exitoso! Nuevo saldo: $" + this.saldo);
                } else {
                    System.out.println("--- WARNING: El saldo es insuficiente. Saldo actual: $" + this.saldo);
                }
            } else {
                System.out.println("--- ERROR: La cantidad a retirar debe ser positiva.");
            }
        }

        public void mostrarInformacionCuenta() {
            System.out.println("Número de Cuenta: " + getNumeroCuenta());
            System.out.println("Titular: " + getNombreTitular());
            System.out.println("Saldo Actual: $" + getSaldo());
        }
    }

    public static void main(String[] args) {
        System.out.println("\n--- Sistema Bancario con Encapsulado ---");

        // Creamos una cuenta
        CuentaBancaria cuenta1 = new CuentaBancaria(
                                        "SDSDFS213S", 
                                        "Ismael SL", 
                                        500);

        CuentaBancaria cuenta2 = new CuentaBancaria(
                                        "ACEA515A52", 
                                        "Héctor HH", 
                                        -2000);

        System.out.println("\n--- CUENTA 1: Información inicial ---");
        cuenta1.mostrarInformacionCuenta();

        System.out.println("\n--- CUENTA 1: Realizando operaciones... ---");
        cuenta1.depositar(200);
        cuenta1.retirar(100);
        cuenta1.retirar(700); // Intento de retiro con saldo insuficiente
        cuenta1.depositar(-50); // Intento de depósito con cantidad negativa

        System.out.println("\n--- CUENTA 1: Información final ---");
        cuenta1.mostrarInformacionCuenta();

        System.out.println("\n--- CUENTA 2: Información inicial ---");
        cuenta2.mostrarInformacionCuenta();
        cuenta2.depositar(1000); // Depósito válido
        cuenta2.mostrarInformacionCuenta();
    }
}
