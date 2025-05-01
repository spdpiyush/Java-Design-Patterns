package example1.refactor;

public class EmailService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Email Sent : " +  message);
    }
}
