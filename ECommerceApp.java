public final class ECommerceApp {
    private final PaymentProcessor processor;

    public ECommerceApp(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void checkout(double amountKzt) {
        System.out.println("Checkout via " + processor.getName() + " for " + amountKzt +"tg";
        processor.processPayment(amountKzt);
        System.out.println("Status: SUCCESS\n");
    }
}
