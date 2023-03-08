import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Kitchen {

    public static void main(String[] args) {


        BlockingQueue<Pizza> kitchen =
                new LinkedBlockingQueue<Pizza>();


        for(int i=0;i<3;i++)
        {
            Thread cook = new Thread(new Cook(kitchen));
            cook.start();
        }

        for(int i=0;i<4;i++)
        {
     
            Thread waiter = new Thread(new Waiter(kitchen));
            waiter.start();
        }

    }
}