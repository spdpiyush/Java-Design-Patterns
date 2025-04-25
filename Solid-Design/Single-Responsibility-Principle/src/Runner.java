import example1.refactor.Invoice;
import example1.refactor.InvoicePrinter;
import example1.refactor.InvoiceRepository;

public class Runner {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("Apple", 34.00);
        InvoiceRepository repository = new InvoiceRepository();
        repository.save(invoice);

        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice);
    }
}
