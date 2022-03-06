package service.senderService;

public class SmsSender implements SenderMessage{

    private SenderMessage sm;

    public SmsSender(SenderMessage sm) {
        this.sm = sm;
    }

    public SmsSender() {
    }

    @Override
    public void send(String message) {
        if (sm!=null)sm.send(message);
        System.out.println("SMS отправлен "+message);
    }
}
