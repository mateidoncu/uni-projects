import java.util.Random;
import java.util.concurrent.BlockingQueue;
public class Cook implements Runnable {


    private final BlockingQueue<Pizza> kitchen;

    private static int id;


    public Cook(BlockingQueue<Pizza> kitchen) {
        this.kitchen = kitchen;
    }


    public void run() {

        try {
            Random rand=new Random();

            int noOfIngredients=rand.nextInt(4) + 3;
            int pizzaId=++id;
            Pizza pizza=new Pizza(pizzaId,noOfIngredients);

            synchronized (this) {
                kitchen.put(pizza);

                System.out.println("Pizza nr "+pizza.getId()+" was added");

                Thread.sleep((5+noOfIngredients)*2);
            }
        } catch (InterruptedException ex) {
            System.out.println("Cook thread interrupted");
        }

    }
}
