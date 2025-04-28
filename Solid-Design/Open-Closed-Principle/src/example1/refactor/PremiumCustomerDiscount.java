package example1.refactor;

public class PremiumCustomerDiscount implements DiscountStrategy{

    @Override
    public double calculateDiscount(double amount) {
        return 0.2 * amount;
    }

}
