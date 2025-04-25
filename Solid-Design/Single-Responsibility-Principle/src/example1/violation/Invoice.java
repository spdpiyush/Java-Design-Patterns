package example1.violation;

/**
 * The Invoice Class Handles multiple responsibilities.
 * i.e. the class has more than one reason to change.
 */
public class Invoice {

    private String customer;
    private double amount;

    public Invoice(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    // 1. Business Logic
    public double calculateTotal() {
        return amount * 2.0; // including GST
    }

    // 2. Persistence Logic
    public void saveToDataBase() {
        System.out.println("Saving to the DataBase");
        // DB save Logic
    }

    // 3. Printing Logic
    public void printInvoice() {
        System.out.println("Customer : " + customer + " Amount : " + amount);
    }
}
