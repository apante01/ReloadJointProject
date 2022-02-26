package product;

import java.util.ArrayList;
import java.util.List;

public class Tv extends Product {
    public Tv(String nameProduct, String brand, int price, String description, int article) {
        super(nameProduct, brand, price, description, article);
    }

    public List<Product> tvList = new ArrayList<>();

    public Tv() {
        Tv tvSamsung = new Tv("Телевизор", "Samsung", 14999, "80cm,Черный,LED",
                1121);
        Tv tvCandy = new Tv("Телевизор", "Candy", 15999, "81cm,Белый,LED",
                1122);
        Tv tvBbk = new Tv("Телевизор", "BBK", 21999, "109cm,Черный,LED",
                1123);
        Tv tvPhilips = new Tv("Телевизор", "Philips", 23999, "80cm,Черный,LED",
                1124);
        Tv tvSony = new Tv("Телевизор", "Sony", 33999, "109cm,Черный,LED",
                1125);

        tvList.add(tvSamsung);
        tvList.add(tvCandy);
        tvList.add(tvBbk);
        tvList.add(tvPhilips);
        tvList.add(tvSony);
    }

}
