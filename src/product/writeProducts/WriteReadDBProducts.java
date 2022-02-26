package product.writeProducts;

import product.DbAllProducts;
import product.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteReadDBProducts {
    private static String DIRECTORY_NAME = "dataProducts/";

    public static void main(String[] args) throws IOException {
        System.out.println("Создать новый файл/записать данные в файл/выгрузить данные из файла");
        System.out.println("1. Создать файл/Записать в файл");
        System.out.println("2. Выгрузить и отобразить данные из файла");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Введите данные " + "\n" + "Введите имя файла");
            dataWrite(scanner);
        } else if (choice == 2) {
            dataRead(scanner);
        }


    }

    private static void dataWrite(Scanner scanner) {
        String productName = scanner.next();
        try (FileWriter fileWriter = new FileWriter(DIRECTORY_NAME + productName, true)) {
            System.out.println("Введите тип товара");
            fileWriter.write("nameProduct:" + scanner.next() + " ");
            System.out.println("Введите брэнд товара");
            fileWriter.write("brand:" + scanner.next() + " ");
            System.out.println("Введите цену товара (в цифрах)");
            fileWriter.write("price:" + scanner.nextInt() + " ");
            System.out.println("Введите описание товара");
            fileWriter.write("description:" + scanner.next() + " ");
            System.out.println("Введите артикул товара (в цифрах)");
            fileWriter.write("article:" + scanner.nextInt() + " ");
            fileWriter.write("\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dataRead(Scanner scanner) {
        String fileName = scanner.next();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(DIRECTORY_NAME +
                fileName))) {
            List<Product> productList = new ArrayList<>();
            String currentLine = "";
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
                if (currentLine != null && !currentLine.isBlank())
                    productList.add(convertStringToProduct(currentLine));
            }
            System.out.println(productList);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Такого файла нет" + fileName + "Введите другой имя файла");
            dataRead(scanner);
        }


    }

    private static Product convertStringToProduct(String currentLine) {
        String[] splited = currentLine.split(" ");
        Product dbAllProducts = new DbAllProducts();

        for (String s : splited) {
            getNameProduct(s, dbAllProducts);
            getBrand(s, dbAllProducts);
            getPrice(s, dbAllProducts);
            getDescription(s, dbAllProducts);
            getarticle(s, dbAllProducts);



        }

        return dbAllProducts;
    }

    private static void getNameProduct(String s, Product p) {
        if (s!=null && s.contains("nameProduct:")){
            p.setNameProduct(s.split(":")[1]);
        }
    }
    private static void getBrand(String s, Product p){
        if (s!=null && s.contains("brand:")){
            p.setBrand(s.split(":")[1]);
        }

    }
    private static void getPrice(String s, Product p){
        if (s!=null && s.contains("price:")){
            p.setPrice(Integer.parseInt(s.split(":")[1]));
        }
    }
    private static void getDescription(String s, Product p){
        if (s!=null && s.contains("description:")){
            p.setDescription(s.split(":")[1]);
        }

    }
    private static void getarticle(String s, Product p){
        if (s!=null && s.contains("article:")){
            p.setArticle(Integer.parseInt(s.split(":")[1]));
        }
    }



}
