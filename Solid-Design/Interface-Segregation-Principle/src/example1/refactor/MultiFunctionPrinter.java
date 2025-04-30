package example1.refactor;

public class MultiFunctionPrinter implements Printer, Scanner, Fax{
    @Override
    public void fax() {
        System.out.println("Fax...");
    }

    @Override
    public void print() {
        System.out.println("Printing....");
    }

    @Override
    public void scan() {
        System.out.println("Scan....");
    }
}
