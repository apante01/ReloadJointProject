package client;

import exception.PhoneNumberInvalidException;

import java.io.FileWriter;
import java.io.IOException;
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

    public void writeDbClient(Scanner scanner) {

        try (FileWriter fw = new FileWriter(CATALOG_NAME, true)) {
            System.out.println("Введите Имя");
            fw.write("name:" + scanner.next() + " ");
            System.out.println("Введите фамилию");
            fw.write("lastName:" + scanner.next() + " ");
            System.out.println("Введите пол (м/ж)");
            fw.write("gender:" + scanner.next() + " ");
            System.out.println("Введите возраст");
            fw.write("age:" + scanner.nextInt() + " ");
            System.out.println("Введите телефон (10 знаков без пробелов +7)");
            checkPhoneNumber(scanner,fw);
            //System.out.println("Введите номер телефона повторно (+7)");
            //checkPhoneNumber(scanner,fw);
            System.out.println("Введите электронную почту");
            fw.write("email:" + scanner.next() + " ");
            fw.write("\n");
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkPhoneNumber(Scanner scanner, FileWriter fw)  {
        try {
            String phone = scanner.next();
            if (phone.length() > 10 || phone.length() < 10) {
                throw new PhoneNumberInvalidException("Номер телефона должен содержать 10 символов: "
                        + phone.length());
            } else {
                fw.write("phoneNumber:" + phone + " ");
            }
        } catch (PhoneNumberInvalidException p) {
            System.out.println(p.getMessage());
            p.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void test(Scanner scanner) {
        System.out.println("У вас осталось 3 попытки");
        String phone = scanner.next();
        if (phone.length() > 10 || phone.length() < 10) {
            System.out.println("У вас осталась 2 попытки");
            scanner.next(phone);}
        else if  (phone.length() > 10 || phone.length() < 10){
            System.out.println("У вас осталась 1 попытка");
        scanner.next(phone);}
    else
            System.out.println("Выйти из регистрации");

    }
    //Метод с циклом while (не пропускает к следующему шагу, пока все условия не будут выполнены)
   /* public void checkPhoneNumber(Scanner scanner, FileWriter fw) throws IOException {
        while (true){
            String phone = scanner.next();
            if (phone.length() > 10 || phone.length() < 10) {
                System.out.println("Вы ввели некоректный телефон, попробуйте снова" +
                        "номер должен содержать 10 цифр (+7)");
            } else if(phone.length() ==10) {
                fw.write("phoneNumber:" + phone + " ");
                break;
            }}}

    */

}
