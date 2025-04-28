package example1.refactor;

public class Runner {

    public static void main(String[] args) {

        DiscountCalculator discountCalculator = new DiscountCalculator(new RegularCustomerDiscount());
        System.out.println("Regular Discount - " + discountCalculator.calculateDiscount(100.00));

        discountCalculator = new DiscountCalculator(new PremiumCustomerDiscount());
        System.out.println("Premium Discount - " + discountCalculator.calculateDiscount(100.00));

        discountCalculator = new DiscountCalculator(new VIPCustomerDiscount());
        System.out.println("VIP Discount - " + discountCalculator.calculateDiscount(100.00));
    }
}
