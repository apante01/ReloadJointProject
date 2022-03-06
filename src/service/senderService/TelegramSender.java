package service.senderService;

public class TelegramSender implements SenderMessage {

    private SenderMessage sm;

    public TelegramSender(SenderMessage sm) {
        this.sm = sm;
    }

    public TelegramSender() {
    }

    @Override
    public void send(String message) {
        if (sm!=null)sm.send(message);
        System.out.println("Telegram отправлен "+message);
    }
}
