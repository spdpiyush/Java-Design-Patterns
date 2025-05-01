package example1.violation;

/**
 * -> NotificationManager is tightly coupled with EmailService.
 * -> we can't switch to another service (eg : SMSService, SlackService ) without creating new Class
 * -> Difficult to Unit Test
 */
public class NotificationManager {

    private EmailService emailService;

    public NotificationManager() {
        /**
         * High Level Module directly depends on Low-Level module.
         */
        this.emailService = new EmailService();
    }

    public void send(String message) {
        emailService.sendMessage(message);
    }
}
