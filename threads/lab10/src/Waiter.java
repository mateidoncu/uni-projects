import java.util.concurrent.BlockingQueue;

public class Waiter implements Runnable {


    private final BlockingQueue<Pizza> kitchen;


    public Waiter(BlockingQueue<Pizza> kitchen) {
        this.kitchen = kitchen;
    }


    public void run() {
        while (true ) {
            try {

                synchronized(this)
                {

                    Pizza pizzaRemoved=kitchen.take();
                    System.out.println("Pizza nr "+pizzaRemoved.getId()+" was removed");
                    Thread.sleep(10);
                }
            } catch (InterruptedException ex) {
                System.out.println("Waiter thread is interrupted.");
            }
        }
    }
}
