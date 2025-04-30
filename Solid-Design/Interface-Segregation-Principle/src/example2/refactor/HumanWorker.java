package example2.refactor;

public class HumanWorker implements Workable, Eatable{
    @Override
    public void eat() {
        System.out.println("Eating Food...");
    }

    @Override
    public void work() {
        System.out.println("Working like a Human..");
    }
}
