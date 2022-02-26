package client;

import java.io.FileWriter;
import java.util.Scanner;

public class Client {
    private static String CATALOG_NAME = "dataClient/база_клиентов.txt";
    private String name;
    private String lastName;
    private String gender;
    private int age;
    private String phoneNumber;
    private String email;

    public Client(String name, String lastName, String gender, int age, String phoneNumber, String email) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Client() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void writeDbClient(Scanner scanner)  {
        String filename = scanner.nextLine();
        try (FileWriter fw = new FileWriter(CATALOG_NAME + filename, true)) {
            System.out.println("Введите Имя");
            fw.write("name:" + scanner.nextLine() + " ");
            System.out.println("Введите фамилию");
            fw.write("lastName:" + scanner.nextLine() + " ");
            System.out.println("Введите пол (м/ж)");
            fw.write("gender:" + scanner.nextLine() + " ");
            System.out.println("Введите возраст");
            fw.write("age:" + scanner.nextInt() + " ");
            System.out.println("Введите телефон (10 знаков без пробелов)");
            fw.write("phoneNumber:" + scanner.nextInt() + " ");
            System.out.println("Введите электронную почту");
            fw.write("email:" + scanner.next() + " ");
            fw.write("\n");
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
