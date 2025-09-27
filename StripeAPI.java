public final class StripeAPI {
    public String getName() { 
        return "Stripe"; 
    }

    public void makeCharge(double cashUsd) {
        System.out.println("[Stripe] Charged: $" + cashUsd);
    }
}
