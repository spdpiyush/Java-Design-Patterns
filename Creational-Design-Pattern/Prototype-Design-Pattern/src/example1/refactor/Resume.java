package example1.refactor;

/**
 *  -> No need to override clone() in each subclass
 *  unless subclass add extra fields or custom logic.
 */
public class Resume extends Document{

    public Resume(String title, String author, String content) {
        super(title, author, content);
    }

}
