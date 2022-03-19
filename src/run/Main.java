package run;

import client.Client;
import onlineStore.OnlineStore;
import service.Basket;
import service.senderService.EmailSender;
import service.senderService.SenderMessage;
import service.senderService.SmsSender;
import service.senderService.TelegramSender;
import thread.ClientThread;
import thread.ThreadBasket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        for (int i = 1; i < 4; i++) {
            Thread t = new Thread(new ThreadBasket(basket));
            t.setName("Достаю товар из корзины "+ i);
            t.start();
        }

        for (int i = 1; i < 2; i++)
            new ClientThread("Добавление товара в корзину " + i).start();
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


    }
}

