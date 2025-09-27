public final class PayPalAdapter implements PaymentProcessor {
    private final PayPalAPI paypal;

    public PayPalAdapter(PayPalAPI paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(double amountUsd) {
        if (amountUsd <= 0) {
            throw new IllegalArgumentException("Amount must be > 0");
        }
        paypal.sendPayment(amountUsd);
    }

    @Override
    public String getName() {
        return paypal.getName();
    }
}
