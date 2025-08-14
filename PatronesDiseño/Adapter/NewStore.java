package PatronesDiseño.Adapter;

// La nueva interfaz que la plataforma espera usar.
interface NewPaymentGateway {
    void processPayment(String creditCardNumber, double amount);
    void refundPayment(String transactionId);
}

// El sistema de pago antiguo con una interfaz diferente.
// No podemos modificar esta clase porque es de un proveedor externo o legacy.
class OldPaymentSystem {
    public void executeTransaction(double total, String cardId) {
        System.out.println("Processing transaction of " + total + " from card ID: " + cardId + " using old system.");
    }
}

// La clase Adapter que permitirá que OldPaymentSystem funcione con la nueva interfaz.
class OldToNewAdapter implements NewPaymentGateway {
    private OldPaymentSystem oldSystem;

    // El adaptador se va a inicializar con el objeto que va a adaptar
    public OldToNewAdapter(OldPaymentSystem system) {
        this.oldSystem = system;
    }

    @Override
    public void processPayment(String creditCardNumber, double amount) {
        // Traducir los parámetros de la nueva interfaz a lo que espera el antiguo
        String cardId = "ID-" + creditCardNumber; // Simular la conversión
        oldSystem.executeTransaction(amount, cardId);
    }

    @Override
    public void refundPayment(String transactionId) {
        // En este caso, el sistema antiguo no tiene soporte para reembolsos
        throw new UnsupportedOperationException("Reembolsos no soportados por el antiguo sistema de pagos");
    }
}

public class NewStore {
    public void checkout(NewPaymentGateway gateway, String creditCard, double total) {
        System.out.println("Initiating checkout process...");
        gateway.processPayment(creditCard, total);
    }
    
    public static void main(String[] args) {
        // Aquí ocurre el problema: OldPaymentSystem no implementa NewPaymentGateway.
        // No podemos pasar una instancia de OldPaymentSystem directamente.
        // NewPaymentGateway oldSystem = new OldPaymentSystem(); // Esto NO compila

        // *** Probar funcionalidad con Adapter
        NewStore store = new NewStore();

        // 1. Usando la nueva pasarela (si existiera)
        // NewPaymentGateway newGateway = new NewGatewayImpl();
        // store.checkout(newGateway, "1111-2222-3333-4444", 100.0);

        // 2. Usamos el sistema antiguo a través del adaptador
        OldPaymentSystem oldSystem = new OldPaymentSystem();
        NewPaymentGateway oldSystemAdapter = new OldToNewAdapter(oldSystem);

        store.checkout(oldSystemAdapter, "5555-6666-7777-8888", 500.0);
    }
}


/*
 * Problema: La clase OldPaymentSystem no implementa la interfaz NewPaymentGateway. 
 * El método checkout espera un objeto que cumpla con NewPaymentGateway, por lo que 
 * el código no puede usar la funcionalidad del sistema antiguo.
 */