package example2.refactor;

public class RegularDocument implements EditableDocument{

    @Override
    public void save() {
        System.out.println("Saving Regular Document...");
    }

    @Override
    public void print() {
        System.out.println("Printing Regular Document...");
    }
}
