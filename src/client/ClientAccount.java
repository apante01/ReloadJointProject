package client;

import dataBase.ClientAccountDataBase;

public class ClientAccount {
    private int idClient;
    private Client client;

    public ClientAccount(int idClient, Client client) {
        this.idClient = idClient;
        this.client = client;
    }

    public ClientAccount() {

    }

    @Override
    public String toString() {
        return "Номер аккаунта: " + idClient + "\n" + "Клиент: " + "\n" + client;
    }

    public static ClientAccount createClientAccount(Client client) {

        return new ClientAccount(client.hashCode(), client);
    }

    public void registrationAccount(ClientAccount clientAccount) {
        ClientAccountDataBase clientAccountDataBase = new ClientAccountDataBase();
        clientAccountDataBase.addInBase(clientAccount);
    }


    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


}
