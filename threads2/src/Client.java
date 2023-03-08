
public class Client extends Thread {
    private Server server;
    private String name;
    public Client(Server s, String name) {
        server = s;
        this.name = name;
    }
    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = server.get();
            System.out.println("Client #" + this.name + " got: " + value);
        }
    }
}
