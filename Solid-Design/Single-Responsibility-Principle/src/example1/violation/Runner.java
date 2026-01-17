package example1.violation;

public class Runner {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("John", 100.00);
        System.out.println(invoice.calculateTotal());
        invoice.saveToDataBase();
        invoice.printInvoice();
    }
}
