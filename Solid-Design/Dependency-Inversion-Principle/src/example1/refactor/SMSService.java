package example1.refactor;

public class SMSService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS Sent : " + message);
    }
}
