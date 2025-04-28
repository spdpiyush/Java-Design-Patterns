package example2.refactor;

public class PayPalPaymentMode implements PaymentMode{

    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of : " + amount);
    }
}
