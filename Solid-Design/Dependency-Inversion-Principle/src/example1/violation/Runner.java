package example1.violation;

public class Runner {

    public static void main(String[] args) {

        NotificationManager manager = new NotificationManager(); // No Flexibility to different Service.
        manager.send("Restaurant Running 50% Discount");
    }
}
