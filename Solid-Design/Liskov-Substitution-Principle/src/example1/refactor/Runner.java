package example1.refactor;

/**
 * -> Treat Square and Rectangle as separate types that implements common interface or abstract class like Shape.
 * -> Inheritance should model is-a relationships only when behavior is truly substitutable.
 */
public class Runner {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Rectangle Area : " + rectangle.computeArea());

        Square square = new Square(5);
        System.out.println("Square Area : " + square.computeArea());
    }
}
