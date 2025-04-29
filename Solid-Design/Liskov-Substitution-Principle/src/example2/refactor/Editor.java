package example2.refactor;

/**
 * -> Editor Depend on the correct abstraction
 */
public class Editor {

    public void saveDocuments(EditableDocument document) {
        document.save();
    }

    public void printDocument(ReadableDocument document) {
        document.print();
    }
}
