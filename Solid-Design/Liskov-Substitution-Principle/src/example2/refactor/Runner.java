package example2.refactor;

/**
 * -> ReadOnlyDocument cannot even passed to a method which saves the document.
 * -> Everything is safe at compile time
 * -> No Runtime error or UnsupportedOperationException
 */
public class Runner {

    public static void main(String[] args) {

        Editor editor = new Editor();

        EditableDocument document1 = new RegularDocument();
        ReadableDocument document2 = new ReadOnlyDocument();

        editor.printDocument(document1);
        editor.printDocument(document2);

        editor.saveDocuments(document1);

        //editor.saveDocuments(document2); // compile time error
    }
}
