package category;

import product.SmartPhone;

import java.util.*;

public class CatPhone extends Category {
    private SmartPhone samsung,dexp440,dexpG450,bq,itelA17;


    public CatPhone(String nameCategory) {
        super(nameCategory);
        samsung = new SmartPhone("Телефон", "Samsung", 14999,
                "Модель-Galaxy, 16ГБ",1111);

        dexp440 = new SmartPhone("Телефон", "DEXP440", 3199,
                "Модель- A440, 8ГБ, розовый",1112);
        dexpG450 = new SmartPhone("Телефон", "DEXP", 3199,
                "Модель- G450, 8ГБ, серый",1113);
        bq = new SmartPhone("Телефон", "BQ", 3999,
                "Модель- 4030G, 16ГБ, черный, камера 2Мп",1114);
        itelA17 = new SmartPhone("Телефон", "Itel", 4199,
                "Модель- A17, 16ГБ, голубой, камера 5Мп",1115);

        List<SmartPhone> smartPhoneList= getListAllSmartphone();
        addMapSmartPhone(smartPhoneList);


    }

    public SmartPhone getSamsung() {
        return samsung;
    }

    public SmartPhone getDexp440() {
        return dexp440;
    }

    public SmartPhone getDexpG450() {
        return dexpG450;
    }

    public SmartPhone getBq() {
        return bq;
    }

    public SmartPhone getItelA17() {
        return itelA17;
    }
    public List<SmartPhone> getListAllSmartphone(){
        List<SmartPhone> smartPhoneList = new ArrayList<>();
        int minPrice =8000;
        int maxPrice =15000;
        smartPhoneList.add(samsung);
        smartPhoneList.add(dexp440);
        smartPhoneList.add(dexpG450);
        smartPhoneList.add(bq);
        smartPhoneList.add(itelA17);
        for (SmartPhone sp : smartPhoneList)
            if (sp.getPrice()>=minPrice && sp.getPrice()<=maxPrice)
                System.out.println(sp);

        return smartPhoneList;
    }

    public void addMapSmartPhone(List<SmartPhone> smartPhoneList){
        Map<String,Integer> smartPhoneMap = new HashMap<>();
        for (SmartPhone sp : smartPhoneList)
            smartPhoneMap.put(sp.getBrand(),sp.getPrice());
        System.out.println("==============================================================");
        System.out.println(smartPhoneMap.keySet()+" "+ smartPhoneMap.values());
        Set set = smartPhoneMap.entrySet();
        for (Object o : set)
            System.out.println(o);
        System.out.println("==============================================================");

    }
}
