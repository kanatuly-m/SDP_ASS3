public class AdapterDemo {
    public static void main(String[] args) {
        PaymentProcessor viaPayPal = new PayPalAdapter(new PayPalAPI());
        PaymentProcessor viaStripe = new StripeAdapter(new StripeAPI());

        ECommerceApp shopA = new ECommerceApp(viaPayPal);
        ECommerceApp shopB = new ECommerceApp(viaStripe);

        shopA.checkout(100.0);
        shopB.checkout(249.99);
    }
}
