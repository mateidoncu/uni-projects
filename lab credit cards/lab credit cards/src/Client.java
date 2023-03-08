import java.util.*;

public class Client {
    private String name;
    private GregorianCalendar bday;
    private String CNP;
    private Address a;
    private int maxSize = 10;
    private List<Card> cards = new ArrayList<>();

    public boolean addCard(Card c){
        if(this.cards.size() < this.maxSize){
            this.cards.add(c);
            return true;
        }
        else
            return false;
    }

    public Card removeCard(String iban){
        Card c = null;
        for(Card cc : cards){
            if(cc.getIBAN().equalsIgnoreCase(iban)) {
                c = cc;
                this.cards.remove(cc);
                System.out.println("The card was successfully removed!");
            }
        }
        return c;
    }

    public static void main(String args[]){
        Address a = new Address("Bucharest",10,"Politehnica");
        DebitCard dc = new DebitCard("RO182828", 1000);
        CreditCard cc = new CreditCard("RO28282", 2000, 3000);
        Client c = new Client("Popescu", new GregorianCalendar(1998, 9, 9), "19809092020", a);
        c.setA(a);
        c.cards.add(dc);
        c.cards.add(cc);
        System.out.println(c.getName());
        dc.withdraw(2000);
        for(Card ccc : c.cards){
            System.out.println(ccc.getIBAN());
        }
        c.removeCard("RO182828");
        for(Card ccc : c.cards){
            System.out.println(ccc.getIBAN());
        }
    }

    public Client(String name, GregorianCalendar bday, String CNP) {
        this.name = name;
        this.bday = bday;
        this.CNP = CNP;
    }

    public Client(String name, GregorianCalendar bday, String CNP, Address a) {
        this.name = name;
        this.bday = bday;
        this.CNP = CNP;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getBday() {
        return bday;
    }

    public void setBday(GregorianCalendar bday) {
        this.bday = bday;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public Address getA() {
        return a;
    }

    public void setA(Address a) {
        this.a = a;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
