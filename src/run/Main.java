package run;

import client.Client;
import onlineStore.OnlineStore;
import service.senderService.EmailSender;
import service.senderService.SenderMessage;
import service.senderService.SmsSender;
import service.senderService.TelegramSender;
import thread.ClientThread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
       new ClientThread("Добавление товара в корзину "+i).start();
        SenderMessage email = new EmailSender(new SmsSender(new TelegramSender()));
        email.send("Скидка 10% на всю электронную технику до конца марта! ");
        System.out.println("----------------------");
        OnlineStore onlineStore = new OnlineStore("@_VES-NA_@");
        onlineStore.getContact();
        System.out.println("1. Зарегистрироваться");
        System.out.println("2. Перейти в каталог");
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Введите число!");
        }
        while (true) {
            int num = scanner.nextInt();
            if (num == 1) {
                client.writeDbClient(scanner);
            } else if (num == 2) {
                System.out.println("Пока ничего");
            } else {
                System.out.println("Такой команды нет введите из предложенного");
            }
        }


        //System.out.println();

    }
}

