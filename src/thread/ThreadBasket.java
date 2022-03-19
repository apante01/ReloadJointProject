package thread;

import service.Basket;

public class ThreadBasket implements Runnable {

    private Basket basket;

    public ThreadBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void run() {
        synchronized (basket) {
            for (int i = 1; i < 4; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), basket.basketCapacity);
                basket.basketCapacity++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException inter) {
                }

            }
            }

    }
}
