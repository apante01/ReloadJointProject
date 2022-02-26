package run;

import client.Client;
import client.ClientAccount;
import dataBase.ClientAccountDataBase;
import dataBase.ProductDataBase;
import onlineStore.OnlineStore;
import product.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OnlineStore onlineStore = new OnlineStore("@_VES-NA_@");
        onlineStore.getContact();
        onlineStore.getTimeStore();

        //Добавляем клиента с регистрацией аккаунта в ClientAccountDataBase;
        Scanner scanner = new Scanner(System.in);
        Client client = Client.createClient(scanner);
        ClientAccount clientAccount = ClientAccount.createClientAccount(client);
        clientAccount.registrationAccount(clientAccount);
        System.out.println(ClientAccountDataBase.getClientBase().toString() + "\n" + "***************************************");

        //Добавляем продукты в общую базу ProductDataBase;
        ProductDataBase productDataBase = Product.addAllProductDataBase();
        System.out.println("Общий список товаров в Базе: " + "\n" + productDataBase.productList.toString());

    }

}
