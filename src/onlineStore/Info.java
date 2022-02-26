package onlineStore;

public interface Info {

    String LINK = "www.vesna.ru";
    String PHONE_NUMBER = "8-800-00-00(from 3:00 till 22:00) ";
    String FEEDBACK = "default@default.ru";

    default void getContact(){
        System.out.println("@ адрес - "+LINK+"\n"+"Телефон горячей линии - "+PHONE_NUMBER+"\n"+
                "Обратаня связь - "+FEEDBACK);
    }




}
