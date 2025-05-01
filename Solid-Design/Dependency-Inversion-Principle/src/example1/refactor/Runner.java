package example1.refactor;

public class Runner {

    public static void main(String[] args) {

        // Constructor Injection
        NotificationManager notificationManager = new NotificationManager(new EmailService());
        notificationManager.sendMessage("Running Discount 50%");

        // Swap b/w services easily
        notificationManager = new NotificationManager(new SMSService());
        notificationManager.sendMessage("FLASH SALE - 60% OFF");

        notificationManager = new NotificationManager(new SlackService());
        notificationManager.sendMessage("Alert!!! High Memory Usage");
    }
}
