package example3.violation;

public class NotificationService {

    public void sendNotification(String type, String message) {
        if ("EMAIL".equalsIgnoreCase(type)) {
            System.out.println("Sending Email: " + message);
        } else if ("SMS".equalsIgnoreCase(type)) {
            System.out.println("Sending SMS: " + message);
        }
    }
}
