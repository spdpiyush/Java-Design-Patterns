package example2.refactor;

public class VenmoPaymentMode implements PaymentMode{
    @Override
    public void pay(double amount) {
        System.out.println("Processing Venmo Payment of " + amount);
    }
}
