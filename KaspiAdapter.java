public final class KaspiAdapter implements PaymentProcessor {
    private final KaspiAPI kaspi;

    public KaspiAdapter(KaspiAPI kaspi) {
        this.kaspi = kaspi;
    }

    @Override
    public void processPayment(double amountKzt) {
        if (amountKzt <= 0) {
            throw new IllegalArgumentException("Amount must be > 0");
        }
        kaspi.sendPayment(amountKzt);
    }

    @Override
    public String getName() {
        return kaspi.getName();
    }
}
