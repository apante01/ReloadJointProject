package product;

import java.util.ArrayList;
import java.util.List;

public class SmartPhone extends Product {
    public SmartPhone(String nameProduct, String brand, int price, String description, int article) {
        super(nameProduct, brand, price, description, article);
    }

    public List<Product> smartPhonesList = new ArrayList<>();

    public SmartPhone() {

        SmartPhone samsung = new SmartPhone("Телефон", "Samsung", 14999,
                "Модель-Galaxy, 16ГБ", 1111);

        SmartPhone dexp440 = new SmartPhone("Телефон", "DEXP440", 3199,
                "Модель- A440, 8ГБ, розовый", 1112);
        SmartPhone dexpG450 = new SmartPhone("Телефон", "DEXP", 3199,
                "Модель- G450, 8ГБ, серый", 1113);
        SmartPhone bq = new SmartPhone("Телефон", "BQ", 3999,
                "Модель- 4030G, 16ГБ, черный, камера 2Мп", 1114);
        SmartPhone itelA17 = new SmartPhone("Телефон", "Itel", 4199,
                "Модель- A17, 16ГБ, голубой, камера 5Мп", 1115);


        smartPhonesList.add(samsung);
        smartPhonesList.add(dexp440);
        smartPhonesList.add(dexpG450);
        smartPhonesList.add(bq);
        smartPhonesList.add(itelA17);
    }

}
