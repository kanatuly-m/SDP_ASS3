public final class HalykAPI {
    public String getName() { 
        return "Halyk"; 
    }

    public void makeCharge(double cashKzt) {
        System.out.println("[Halyk] Charged: " + cashKzt);
    }
}
