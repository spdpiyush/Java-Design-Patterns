package example1.refactor;

public class SlackService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Slack Message Sent : " + message);
    }
}
