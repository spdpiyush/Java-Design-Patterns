package example1.refactor;

public class VIPCustomerDiscount implements DiscountStrategy{

    @Override
    public double calculateDiscount(double amount) {
        return 0.3 * amount;
    }
}
