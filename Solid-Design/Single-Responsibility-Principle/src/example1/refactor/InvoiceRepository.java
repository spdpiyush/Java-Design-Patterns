package example1.refactor;

/**
 * Single Responsibility : saving invoices
 */
public class InvoiceRepository {

    public void save(Invoice invoice) {
        // save logic
        System.out.println("InvoiceRepository::save() for invoice : " + invoice);
    }
}
