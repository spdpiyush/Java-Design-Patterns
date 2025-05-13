package example2.violation;

import example2.EmailNotification;
import example2.Notification;
import example2.PushNotification;
import example2.SmsNotification;

/**
 * -> Adding new NotificationType = modifying client
 */
public class Runner {

    public static void main(String[] args) {

        String notificationType = "sms";
        Notification notification;
        if (notificationType.equalsIgnoreCase("email")) {
            notification = new EmailNotification();
        }else if (notificationType.equalsIgnoreCase("sms")) {
            notification = new  SmsNotification();
        }else if (notificationType.equalsIgnoreCase("push")){
            notification = new PushNotification();
        }else {
            throw new IllegalArgumentException("Unkown notification Type");
        }
        notification.notifyUser("50% Off");

    }
}
