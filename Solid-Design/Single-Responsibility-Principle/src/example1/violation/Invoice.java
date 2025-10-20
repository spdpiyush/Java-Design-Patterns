package example1.violation;

/**
 * <p>
 *     The Invoice Class Handles multiple responsibilities.
 *     <ol>
 *         <li>Business Logic (calculateTotal) </li>
 *         <li>Printing (printInvoice) </li>
 *         <li>Persistence (saveToDatabase> </li>
 *     </ol>
 * </p>
 *
 * i.e. the class has more than one reason to change.
 */
public class Invoice {

    private String customerName;
    private double amount;

    public Invoice(String customer, double amount) {
        this.customerName = customer;
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
        System.out.println("Customer : " + customerName + " Amount : " + amount);
    }
}
