public class AdapterDemo {
    public static void main(String[] args) {
        PaymentProcessor viaKaspi = new KaspiAdapter(new KaspiAPI());
        PaymentProcessor viaHalyk = new HalykAdapter(new HalykAPI());

        ECommerceApp shopA = new ECommerceApp(viaKaspi);
        ECommerceApp shopB = new ECommerceApp(viaHalyk);

        shopA.checkout(100.0);
        shopB.checkout(249.99);
    }
}
