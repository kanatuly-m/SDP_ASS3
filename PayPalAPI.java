public final class PayPalAPI {
    public String getName() { 
        return "PayPal"; 
    }

    public void sendPayment(double moneyUsd) {
        System.out.println("[PayPal] Processed: $" + moneyUsd);
    }
}
