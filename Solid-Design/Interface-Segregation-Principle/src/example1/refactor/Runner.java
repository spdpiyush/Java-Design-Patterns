package example1.refactor;

public class Runner {
    public static void main(String[] args) {
        SimplePrinter printer = new SimplePrinter();
        printer.print();

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print();
        multiFunctionPrinter.fax();
        multiFunctionPrinter.scan();
    }
}
