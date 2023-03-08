package OOP_Lab3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Storable{

    ArrayList<Card> cardlist = new ArrayList<Card>();

    public void addCard(Card c)
    {
        cardlist.add(c);
    }

    public void deleteCard(Card.Rank r, Card.Suit s)
    {
        Card temp = null;
        for(Card c : cardlist)
        {
            if(c.getRank() == r && c.getSuit() == s)
            {
                temp = c;
            }
        }
        if(temp != null) cardlist.remove(temp);
    }

    public void display()
    {
        for(Card c : cardlist)
        {
            System.out.println(c.getRank() + " of " + c.getSuit());
        }
    }

    public void sort()
    {

        //sorting by rank (ordered the sorting so that it displays as requested)
        Collections.sort(cardlist,
                new Comparator<Card>()
                {
                    public int compare(Card o1, Card o2)
                    {
                        return o1.getRank().compareTo(o2.getRank());
                    }
                });

        //sorting by suit (done second)
        Collections.sort(cardlist,
                new Comparator<Card>()
                {
                    public int compare(Card o1, Card o2)
                    {
                        if(o1.getRank() == o2.getRank() && o1.getSuit() == o2.getSuit())
                        {
                            //custom exception
                            throw new RuntimeException("There are two cards of type " + o2.getRank() + " of " + o2.getSuit() + ". Someone's cheating.");
                        }
                        return o1.getSuit().compareTo(o2.getSuit());
                    }
                });

    }

    public void store(String file) throws FileNotFoundException
    {
        FileOutputStream outputFile = new FileOutputStream ("hand.txt");
        OutputStreamWriter outputStream = new OutputStreamWriter(outputFile);
        PrintWriter pw = new PrintWriter(outputStream);
        pw.println("The hand in order:");
        for(Card c : cardlist)
        {
            pw.println(c.getRank() + " of " + c.getSuit());
        }
        pw.close();
    }

}
