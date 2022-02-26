package onlineStore;

import category.Technics;

import java.util.Date;

public class OnlineStore implements Info {
    private String nameStore;
    private Technics technics;

    public OnlineStore(String nameStore) {
        this.nameStore = nameStore;
        technics = new Technics("Техника",this);
    }

    public String getNameStore() {
        return nameStore;
    }

    public Technics getTechnics() {
        return technics;
    }

    @Override
    public void getContact() {
        System.out.println("Название магазина - " + nameStore + "\n" + "@ адрес - " + LINK +
                "\n" + "Телефон горячей линии - " + PHONE_NUMBER + "\n" + "Обратная связь - " + FEEDBACK);
    }

    public void getTimeStore() {
        Date date = new Date();
        System.out.println("***************************************" + "\n" + "Текущее время: " + date.getHours() +
                " час(ов) : " + date.getMinutes() + " минут(ы)" + "\n" + "***************************************");
        if (date.getHours() < 8) {
            System.out.println("Магазин закрыт" + "\n" + "\n" + "Магазин откроется через " + (7 - date.getHours()) +
                    " час(ов) : " + (60 - date.getMinutes()) + " минут(ы)");
        } else if (date.getHours() < 23) {
            System.out.println("Магазин: " + getNameStore() + "открыт");
            storeOpen();
        } else {
            System.out.println("Магазин " + getNameStore() + " закрыт" + "\n" + "Магазин откроется через " + (31 - date.getHours()) +
                    " час(ов) : " + (60 - date.getMinutes()) + " минут(ы)");
            System.exit(0);
        }
    }

    public void storeOpen() {
        System.out.println("Добро пожаловать в интернет-магазин: " + getNameStore());
    }
}
