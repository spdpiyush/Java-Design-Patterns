package example2.refactor;

import example2.Notification;

public class Runner {

    public static void main(String[] args) {

        Notification notification = NotificationFactory.createNotification("push");
        notification.notifyUser("Crazy SALE 50% OFF");
    }
}
