package example2.refactor;

public class ReadOnlyDocument implements ReadableDocument{

    @Override
    public void print() {
        System.out.println("Printing ReadOnly Documents...");
    }
}
