package example3.refactor;

/**
 * <p>
 *     NotificationService stay untouched.
 * </p>
 */
public class NotificationService {

    public void sendNotification(Notification notification, String message) {
        notification.send(message);
    }
}
