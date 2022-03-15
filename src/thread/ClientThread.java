package thread;

public class ClientThread extends Thread {

    public ClientThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread());
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s товар добавлен в корзину \n",Thread.currentThread().getName());
    }


}
