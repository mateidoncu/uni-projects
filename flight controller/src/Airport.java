public class Airport extends Thread{
    private FlightQueue flightQueue;
    private int number;
    public Airport(FlightQueue fq, int number){
        flightQueue = fq;
        this.number = number;
    }

    public void run(){
        int value = 0;
        for(int i=0; i<10; i++){
            value = flightQueue.get();
            System.out.println("Flight #" + this.number + value + " has landed" );
        }
    }
}
