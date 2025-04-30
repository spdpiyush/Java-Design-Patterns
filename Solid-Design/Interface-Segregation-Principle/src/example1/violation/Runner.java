package example1.violation;

public class Runner {

    public static void main(String[] args) {
        Machine printer = new SimplePrinter();
        printer.print();
        printer.scan();
        printer.fax();
    }
}
