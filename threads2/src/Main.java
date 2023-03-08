public class Main {
    public static void main(String[] args) {
        Server s=new Server();
        Client c1=new Client(s, "client1");
        Client c2=new Client(s,"client2");
        Client c3=new Client(s, "client3");
        Client c4=new Client(s, "client4");
        Client c5=new Client(s, "client5");
        Worker w1=new Worker(s, "worker1");
        Worker w2=new Worker(s, "worker2");
        Worker w3=new Worker(s, "worker3");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        w1.start();
        w2.start();
        w3.start();
    }
}
