package example1.refactor;

/**
 *  -> Easy for Extension, no modification to existing classes.
 *  -> Clean, Maintainable.
 */
public class DiscountCalculator {

    private final DiscountStrategy discountStrategy;

    public DiscountCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double amount) {
        return discountStrategy.calculateDiscount(amount);
    }
}
