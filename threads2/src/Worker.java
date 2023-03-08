public class Worker extends Thread {
    private Server server;
    private String name;
    public Worker(Server s, String name) {
        server = s;
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            server.put(i);
            System.out.println("Worker #" + this.name + " put order in queue: " + i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}
