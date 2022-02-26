package run;

import client.Client;
import onlineStore.OnlineStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OnlineStore onlineStore = new OnlineStore("@_VES-NA_@");
        onlineStore.getContact();
        System.out.println("1. Зарегистрироваться");
        System.out.println("2. Перейти в каталог");
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Введите число!");}
        int num = scanner.nextInt();
        if (num == 1) {
            client.writeDbClient(scanner);
        }
        else if(num == 2){
            System.out.println("Пока ничего");
        }







        System.out.println();

    }
}

