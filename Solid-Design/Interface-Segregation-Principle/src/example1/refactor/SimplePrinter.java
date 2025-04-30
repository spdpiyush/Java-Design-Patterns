package example1.refactor;

/**
 * -> Don't have any irrelevant method implementations.
 */
public class SimplePrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Printing....");
    }
}
