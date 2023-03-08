package Ex2;

public class Cook extends Thread{
    String name;
    Kitchen k;
    public Cook(Kitchen k, String name){
…
    }
    @Override
    public synchronized void run(){
        Pizza current=null;
//get current pizza from kitchen; wait for 5+noIng * 2; display the
//time when he ordered the pizza; run();
    }
}