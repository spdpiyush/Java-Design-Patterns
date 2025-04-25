package example1.refactor;

/**
 * Single Responsibility : Printing Invoice
 */
public class InvoicePrinter {

    public void print(Invoice invoice) {
        System.out.println("Invoice for " + invoice.getCustomer() + " : " + invoice.getAmount());
    }
}
