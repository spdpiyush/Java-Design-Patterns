package example2.refactor;

/**
 * -> separated editable behavior
 */
public interface EditableDocument extends ReadableDocument{

    void save();
}
