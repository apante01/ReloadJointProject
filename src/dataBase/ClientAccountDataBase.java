package dataBase;

import client.Client;
import client.ClientAccount;
import product.Product;

import java.util.ArrayList;
import java.util.List;

public class ClientAccountDataBase extends DataBase {
    private Client client;
    private static List<ClientAccount> clientBase = new ArrayList<>();


    public void addInBase(ClientAccount clientAccount) {
        clientBase.add(clientAccount);

    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public static List<ClientAccount> getClientBase() {
        return clientBase;
    }

    public static void setClientBase(List<ClientAccount> clientBase) {
        ClientAccountDataBase.clientBase = clientBase;
    }

    @Override
    public List<Product> findAllProducts() {
        return null;
    }

    @Override
    public Product findProduct(String name) {
        return null;
    }

    @Override
    public List<Product> findProducts(int price) {
        return null;
    }

    @Override
    public List<Product> putInBasket(Product product) {
        return null;

    }
}

