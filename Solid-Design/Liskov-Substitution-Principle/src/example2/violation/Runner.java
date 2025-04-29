package example2.violation;

/**
 * -> Anywhere Document is expected if we replace with ReadOnlyDocument it doesn't work.
 * i.e. Changes the behavior
 */
public class Runner {

    public static void main(String[] args) {
        Editor editor = new Editor();

        Document document = new Document();
        editor.saveDocument(document);

        document = new ReadOnlyDocument(); // if replaced with Child Class
        editor.saveDocument(document); // throws an exception
    }
}
