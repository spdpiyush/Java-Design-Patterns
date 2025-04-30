package example2.violation;

public class HumanWorker implements Worker{
    @Override
    public void work() {
        System.out.println("Working like Human...");
    }

    @Override
    public void eat() {
        System.out.println("Eating Food...");
    }
}
