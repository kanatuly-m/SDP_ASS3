public final class ECommerceApp {
    private final PaymentProcessor processor;

    public ECommerceApp(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void checkout(double amountUsd) {
        System.out.println("Checkout via " + processor.getName() + " for $" + amountUsd);
        processor.processPayment(amountUsd);
        System.out.println("Status: SUCCESS\n");
    }
}
