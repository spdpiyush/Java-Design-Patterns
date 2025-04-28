package example2.refactor;

public class CreditCardPayment implements PaymentMode{

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}
