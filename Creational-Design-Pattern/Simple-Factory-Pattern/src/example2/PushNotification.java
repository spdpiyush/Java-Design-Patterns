package example2;

public class PushNotification implements Notification{

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Push Notification, with Msg = " + message);
    }
}
