public final class StripeAdapter implements PaymentProcessor {
    private final StripeAPI stripe;

    public StripeAdapter(StripeAPI stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amountUsd) {
        if (amountUsd <= 0) {
            throw new IllegalArgumentException("Amount must be > 0");
        }
        stripe.makeCharge(amountUsd);
    }

    @Override
    public String getName() {
        return stripe.getName();
    }
}

