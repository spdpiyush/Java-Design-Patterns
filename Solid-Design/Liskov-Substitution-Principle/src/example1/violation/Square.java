package example1.violation;

/**
 * Geometrically Square is an Rectangle
 */
public class Square extends Rectangle{

    @Override
    public void setWidth(int side) {
        setSide(side);
    }

    private void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setHeight(int side) {
        setSide(side);
    }

}
