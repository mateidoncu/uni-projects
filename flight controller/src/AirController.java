public class AirController extends Thread{
    private FlightQueue flightQueue;
    private int number;
    public AirController(FlightQueue fq, int number){
        flightQueue = fq;
        this.number = number;
    }

    public void run(){
        for(int i=0; i<10; i++){
            flightQueue.put(i);
            System.out.println("AirController put Flight #" + this.number + i);
            try {
                sleep((int)(Math.random() * 5));
            }
            catch (InterruptedException e){}
        }
    }
}
