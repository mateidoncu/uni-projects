package Ex1;

class Producer extends Thread {
    private Cookie cookie;
    private int number;
    public Producer(Cookie c, int number) { cookie = c;
        this.number = number;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            cookie.put(i);
            System.out.println("Producer #" + this.number + "
                    put: " + i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}