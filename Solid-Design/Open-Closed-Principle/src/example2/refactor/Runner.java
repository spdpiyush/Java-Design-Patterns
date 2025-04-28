package example2.refactor;

/**
 * -> Adding PaymentMode -> open for extension
 * -> Loose Coupling, easier to test without disturbing already tested code.
 */
public class Runner {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService(new PayPalPaymentMode());
        paymentService.pay(10.00);

        paymentService = new PaymentService(new VenmoPaymentMode());
        paymentService.pay(25.00);

        paymentService = new PaymentService(new CreditCardPayment());
        paymentService.pay(100.00);
    }
}
