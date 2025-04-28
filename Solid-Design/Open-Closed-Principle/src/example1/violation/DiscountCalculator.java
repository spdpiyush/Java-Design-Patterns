package example1.violation;

/**
 * Class violates OCP b.coz
 *  -> everyTime if new customerType is introduced, we need to modify the calculateDiscount method.
 *  -> Risk of breaking code on change.
 *  -> Code become more fragile and messy.
 *
 */
public class DiscountCalculator {

    public double calculateDiscount(String customerType, double amount) {
        return switch (customerType) {
            case "Regular" -> 0.1 * amount;
            case "Premium" -> 0.2 * amount;
            case "VIP" -> 0.3 * amount;
            default -> 0.0;
        };
    }
}
