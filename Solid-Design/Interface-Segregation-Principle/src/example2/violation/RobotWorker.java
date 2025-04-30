package example2.violation;

/**
 * -> eat() leading to Runtime Exception.
 */
public class RobotWorker implements Worker{
    @Override
    public void work() {
        System.out.println("working like a Robot..");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot doesn't eat");
    }
}
