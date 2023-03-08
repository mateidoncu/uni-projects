public class Computer {
    private int RAM;
    private String processor;

    public Computer(int r, String p){
        this.RAM = r;
        this.processor = p;
    }

    public int getRAM(){
        return RAM;
    }

    public void setRAM(int r){
        this.RAM = r;
    }

    public String getProcessor(){
        return processor;
    }

    public void setProcessor(String p){
        this.processor = p;
    }

}
