package example2.refactor;

public class PaymentService {

    private PaymentMode paymentMode;

    public PaymentService(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public void pay(double amount) {
        paymentMode.pay(amount);
    }
}
