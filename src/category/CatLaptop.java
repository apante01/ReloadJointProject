package category;

import product.Laptop;

import java.util.ArrayList;
import java.util.List;

public class CatLaptop extends Category{
    private Laptop irbis,asus,lenovo,hp,dell;
    private List<Laptop> laptopList;


    public CatLaptop(String nameCategory) {
        super(nameCategory);
        irbis = new Laptop("Ноутбук", "Irbis", 12499,
                "Процессор - Intel Atom, 4 ядра,RAM 2GB", 1116);
        asus = new Laptop("Ноутбук", "ASUS", 19999,
                "Процессор - Intel CELERON N4020, 2 ядра,RAM 4GB", 1117);
        lenovo = new Laptop("Ноутбук", "Lenovo", 20999,
                "Процессор - AMD 3020e, 2 ядра,RAM 4GB", 1118);
        hp = new Laptop("Ноутбук", "HP", 23799,
                "Процессор - Intel CELERON N4500, 2 ядра,RAM 4GB", 1119);
        dell = new Laptop("Ноутбук", "Dell", 34999,
                "Процессор - Intel Core i3 1115G4, 2 ядра,RAM 4GB", 1120);
        List<Laptop>laptopList = getAllLaptop();
    }

    public Laptop getIrbis() {
        return irbis;
    }

    public Laptop getAsus() {
        return asus;
    }

    public Laptop getLenovo() {
        return lenovo;
    }

    public Laptop getHp() {
        return hp;
    }

    public Laptop getDell() {
        return dell;
    }

    public List<Laptop> getLaptopList() {
        return laptopList;
    }
    public List<Laptop> getAllLaptop(){
        List<Laptop>laptopList = new ArrayList<>();
        laptopList.add(irbis);
        laptopList.add(asus);
        laptopList.add(lenovo);
        laptopList.add(hp);
        laptopList.add(dell);
        for (Laptop lt : laptopList)
            System.out.println(lt);
        return laptopList;

    }
}

