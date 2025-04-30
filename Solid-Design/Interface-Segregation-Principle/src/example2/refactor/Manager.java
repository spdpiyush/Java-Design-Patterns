package example2.refactor;

public class Manager {

    public void manage(Workable worker) {
        worker.work();
    }

    public void feed(Eatable eater) {
        eater.eat();
    }
}
