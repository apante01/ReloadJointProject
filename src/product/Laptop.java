package product;

import java.util.ArrayList;
import java.util.List;

public class Laptop extends Product {
    public Laptop(String nameProduct, String brand, int price, String description, int article) {
        super(nameProduct, brand, price, description, article);
    }

    public List<Product> laptopList = new ArrayList<>();

    public Laptop() {
        Laptop irbis = new Laptop("Ноутбук", "Irbis", 12499,
                "Процессор - Intel Atom, 4 ядра,RAM 2GB", 1116);
        Laptop asus = new Laptop("Ноутбук", "ASUS", 19999,
                "Процессор - Intel CELERON N4020, 2 ядра,RAM 4GB", 1117);
        Laptop lenovo = new Laptop("Ноутбук", "Lenovo", 20999,
                "Процессор - AMD 3020e, 2 ядра,RAM 4GB", 1118);
        Laptop hp = new Laptop("Ноутбук", "HP", 23799,
                "Процессор - Intel CELERON N4500, 2 ядра,RAM 4GB", 1119);
        Laptop dell = new Laptop("Ноутбук", "Dell", 34999,
                "Процессор - Intel Core i3 1115G4, 2 ядра,RAM 4GB", 1120);

        laptopList.add(irbis);
        laptopList.add(asus);
        laptopList.add(lenovo);
        laptopList.add(hp);
        laptopList.add(dell);

    }

}
