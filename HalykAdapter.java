public final class HalykAdapter implements PaymentProcessor {
    private final HalykAPI halyk;

    public HalykAdapter(HalykAPI halyk) {
        this.halyk = halyk;
    }

    @Override
    public void processPayment(double amountKzt) {
        if (amountKzt <= 0) {
            throw new IllegalArgumentException("Amount must be > 0");
        }
        halyk.makeCharge(amountKzt);
    }

    @Override
    public String getName() {
        return halyk.getName();
    }
}

