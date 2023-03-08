package Ex2;

public class Kitchen {
    ArrayList<Pizza> order;
    public final int MAX_SIZE;
    public Kitchen(){
…
    }
    public synchronized void add(Pizza o) throws InterruptedException{
//check order size, use wait(), order.add(o), notify()
    }
    public synchronized Pizza get() throws InterruptedException{
//check order.size(); wait(); remove from order the pizza order
    }
}