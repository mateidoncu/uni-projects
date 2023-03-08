package Ex2;

public class Waiter extends Thread {
    public static int incrementer=0;
    public Kitchen k;
    public String name;
    public Waiter(Kitchen k, String name){
…
    }
    public synchronized void run(){
//submit the order, wait for 10 ms; run()
    }
    public synchronized void submitOrder(){
//create random no with Random r=new Random(); use r.nextInt(10);
//add pizza order
//to kitchen
    }
}