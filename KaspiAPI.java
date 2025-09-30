public final class KaspiAPI {
    public String getName() { 
        return "Kaspi"; 
    }

    public void sendPayment(double moneyKzt) {
        System.out.println("[Kaspi] Processed: " + moneyKzt + "tg");
    }
}
