package example2.violation;

/**
 *  -> Adding new paymentMode, modifies the PaymentService
 *  -> Tight Coupling
 *  -> Error Prone
 */
public class PaymentService {

    public void pay(String paymentMode, double amount) {

        if (paymentMode.equals("PAYPAL")) {
            System.out.println("Processing Payment via PayPal..." + amount);
        }else if (paymentMode.equals("VENMO")) {
            System.out.println("Processing Payment via Venmo..." + amount);
        }else if (paymentMode.equals("CreditCard")) {
            System.out.println("Processing Payment via CreditCard..." + amount);
        }
    }
}
