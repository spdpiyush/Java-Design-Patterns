package example1.refactor;

public class RegularCustomerDiscount implements DiscountStrategy {

    @Override
    public double calculateDiscount(double amount) {
        return 0.1 * amount;
    }

}
