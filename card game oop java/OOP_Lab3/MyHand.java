package OOP_Lab3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyHand implements Storable {
    private List<MyCard> cards = new ArrayList<>();

    public void addCard(MyCard c){
        this.cards.add(c);
        System.out.println("Added card: " + c.toString());
    }

    public boolean deleteCard(MyCard.Rank r, MyCard.Suit s){
        boolean found = false;
        MyCard temp = null;
        for(MyCard c : cards){
            if(c.getR().getText().equalsIgnoreCase(r.getText()) &&
                c.getS().getValue() == s.getValue()){
                found = true;
                temp = c;
            }
        }
        if(temp != null) cards.remove(temp);

        return found;
    }

    public void sort(){
        //sorting based on suit
        Collections.sort(cards, new Comparator<MyCard>() {
            @Override
            public int compare(MyCard o1, MyCard o2) {
                return o1.getS().getValue() - o2.getS().getValue();
            }
        });

        //sorting by rank (ordered the sorting so that it displays as requested)
        Collections.sort(cards, new Comparator<MyCard>()
                {
                    public int compare(MyCard o1, MyCard o2)
                    {
                        return o1.getR().compareTo(o2.getR());
                    }
                });

        //sorting by suit (done second), but you also check if someone is cheating (there exist duplicates for a card based on rank and suit)
        Collections.sort(cards, new Comparator<MyCard>()
                {
                    public int compare(MyCard o1, MyCard o2)
                    {
                        if(o1.getR() == o2.getR() && o1.getS() == o2.getS())
                        {
                            //custom exception
                            throw new RuntimeException("There are two cards of type " + o2.getR() + " of " + o2.getS() + ". Someone's cheating.");
                        }
                        return o1.getS().compareTo(o2.getS());
                    }
                });

    }

    public void display(){
        for(MyCard c : cards)
            System.out.println(c.toString());
    }

    @Override
    public void store(String file) throws FileNotFoundException {
        FileOutputStream outputFile=new FileOutputStream("hand.txt", true);
        OutputStreamWriter outputStream=new OutputStreamWriter(outputFile);
        PrintWriter pw=new PrintWriter(outputStream);
        for(MyCard c : cards)
            pw.println(c.toString());
        pw.close();
    }
}
