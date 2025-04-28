package example1.refactor;

/**
 * Defines a Base / common interface.
 * i.e. Open for Extension
 */
public interface DiscountStrategy {

    double calculateDiscount(double amount);
}
