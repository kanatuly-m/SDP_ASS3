public interface PaymentProcessor {
    void processPayment(double amountKzt);
    String getName();
}
