package service.senderService;

public class EmailSender implements SenderMessage{

   private SenderMessage sm;

    public EmailSender(SenderMessage sm) {
        this.sm = sm;
    }

    public EmailSender() {
    }

    @Override
    public void send(String message) {
        if (sm!=null)sm.send(message);
        System.out.println("Email отправлен "+message);
    }
}
