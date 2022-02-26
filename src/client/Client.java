package client;

import java.util.Scanner;

public class Client {
    private String name;
    private String lastName;
    private String gender;
    private int age;
    private long phoneNumber;
    private String email;
    private ClientAccount clientAccount;


    public Client(String name, String lastName, String gender, int age, int phoneNumber, String email) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    public Client() {

    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n" + "Фамилия: " + lastName + "\n" + "Пол: " + gender + "\n" + "Возраст: " + age +
                "\n" + "Номер телефона: " + phoneNumber + "\n" + "Email: " + email;

    }

    public static Client createClient(Scanner scanner){
        Client client = new Client();
        System.out.println("******************************" + "\n" + "Регистрация аккаунта" + "\n" + "******************************");
        System.out.println("Анкетные данные:" + "\n" + "******************************");
        System.out.println("Имя:");
        client.setName(scanner.next());
        System.out.println("Фамилия:");
        client.setLastName(scanner.next());
        System.out.println("Пол (М/Ж):");
        client.setGender(scanner.next());
        System.out.println("Возраст (лет):");
        client.setAge(scanner.nextInt());
        System.out.println("Номер телефона (10 знаков без пробелов):");
        client.setPhoneNumber(scanner.nextLong());
        System.out.println("Email:");
        client.setEmail(scanner.next());

        return client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClientAccount getClientAccount() {
        return clientAccount;
    }

    public void setClientAccount(ClientAccount clientAccount) {
        this.clientAccount = clientAccount;
    }
}
