package category;

import onlineStore.OnlineStore;

public class Technics extends Category{
    private CatPhone catPhone;
    private CatTv catTv;
    private CatLaptop catLaptop;
    private OnlineStore onlineStore;


    public Technics(String nameCategory,OnlineStore onlineStore) {
        super(nameCategory);
        this.onlineStore = onlineStore;
        catPhone = new CatPhone("Телефоны");
        catLaptop = new CatLaptop("Ноутбуки");
        catTv = new CatTv("Телевизоры");
    }

    public CatPhone getCatPhone() {
        return catPhone;
    }

    public OnlineStore getOnlineStore() {
        return onlineStore;
    }

    public CatTv getCatTv() {
        return catTv;
    }

    public CatLaptop getCatLaptop() {
        return catLaptop;
    }
}

