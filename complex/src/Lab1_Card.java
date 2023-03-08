public abstract class Lab1_Card implements Comparable<Lab1_Card>, Storable {

    private String IBAN;
    private int ammount;

    public Lab1_Card(String IBAN, int ammount) {
        this.IBAN = IBAN;
        this.ammount = ammount;
    }

    @Override
    public String toString() {
        return "Lab1_Card{" +
                "IBAN='" + IBAN + '\'' +
                ", ammount=" + ammount +
                '}';
    }

    public abstract void withdraw (int sum);

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
}
