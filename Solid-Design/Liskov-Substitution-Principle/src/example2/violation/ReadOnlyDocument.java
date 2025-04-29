package example2.violation;

public class ReadOnlyDocument extends Document{

    @Override
    public void save() {
        throw new UnsupportedOperationException("Can't save Read Only Document");
    }
}
