package Ex1;

class Consumer extends Thread {
    private Cookie cookie;
    private int number;
    public Consumer(Cookie c, int number) {
        cookie = c;
        this.number = number;
    }
    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cookie.get();
            System.out.println("Consumer #" + this.number + "
                    got: " + value);
        }
    }
}