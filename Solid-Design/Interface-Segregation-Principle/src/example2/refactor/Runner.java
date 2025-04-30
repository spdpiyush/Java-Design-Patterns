package example2.refactor;

public class Runner {

    public static void main(String[] args) {

        Manager manager = new Manager();

        HumanWorker johnDoe = new HumanWorker();
        RobotWorker robot = new RobotWorker();

        manager.manage(johnDoe);
        manager.manage(robot);

        manager.feed(johnDoe);
        //manager.feed(robot); // compile-time error
    }
}
