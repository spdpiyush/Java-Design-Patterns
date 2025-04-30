package example1.violation;

/**
 * -> SimplePrinter is forced to implement scan() and fax() operation, it doesn't support.
 * -> Interface Pollution
 */
public class SimplePrinter implements Machine{

    @Override
    public void print() {
        System.out.println("Printing....");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("scan operation not allowed");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("fax operation not allowed");
    }
}
