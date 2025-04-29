package example1.violation;

/**
 *  -> Square changes the behaviour of Rectangle
 *  -> it breaks the principle when subclass should be substituted with superclass.
 */
public class Runner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        System.out.println("Area : " + rectangle.computeArea());

        rectangle = new Square(); // if we replace with Child Class
        rectangle.setHeight(20);
        rectangle.setWidth(5);
        System.out.println("Area " + rectangle.computeArea()); // expectation is 100 but returns 25

    }
}
