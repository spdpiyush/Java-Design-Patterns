package example1.refactor;

/**
 * Core Invoice Data
 * Holds invoice data and Business Logic
 */
public class Invoice {

    private String customer;
    private double amount;

    public Invoice(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public String getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customer='" + customer + '\'' +
                ", amount=" + amount +
                '}';
    }

    public double calculateTotal() {
        return amount * 2.0;
    }
}
