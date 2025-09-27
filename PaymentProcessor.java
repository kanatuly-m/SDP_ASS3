public interface PaymentProcessor {
    void processPayment(double amountUsd);
    String getName();
}
