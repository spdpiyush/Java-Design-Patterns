package example2.refactor;

import example2.EmailNotification;
import example2.Notification;
import example2.PushNotification;
import example2.SmsNotification;

public class NotificationFactory {

    public static Notification createNotification(String notificationType) {

        if (notificationType == null || notificationType.isEmpty()) {
            throw new IllegalArgumentException("notificationType cannot be null/empty.");
        }
        if (notificationType.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }else if (notificationType.equalsIgnoreCase("sms")) {
            return  new SmsNotification();
        }else if (notificationType.equalsIgnoreCase("push")){
            return new PushNotification();
        }else {
            throw new IllegalArgumentException("Unknown notification Type : " + notificationType);
        }
    }
}
