package example1.refactor;

/**
 * Single Responsibility : Handles Printing Responsibility
 */
public class InvoicePrinter {

    public void print(Invoice invoice) {
        System.out.println("Invoice for " + invoice.getCustomer() + " : " + invoice.getAmount());
    }
}
