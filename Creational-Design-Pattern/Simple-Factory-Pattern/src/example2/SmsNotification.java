package example2;

public class SmsNotification implements Notification{

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS Notification, with Msg = " + message);
    }
}
