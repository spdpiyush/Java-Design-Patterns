package example1.refactor;

/**
 * Now, Split into 3 classes with single responsibility
 * Easy to test, modify and extend
 * Clean, modular design
 */
public class Runner {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("Apple", 34.00);
        InvoiceRepository repository = new InvoiceRepository();
        repository.save(invoice);

        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice);
    }
}
