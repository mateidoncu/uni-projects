package OOP_Lab3;
import java.io.FileNotFoundException;

public class Driver {

    public static void main (String[]args) throws FileNotFoundException
    {
        MyHand h = new MyHand();

        //Adding the cards
        System.out.println("Adding cards.");

        h.addCard(new MyCard(MyCard.Rank.ACE, MyCard.Suit.HEARTS));
        h.addCard(new MyCard(MyCard.Rank.TWO, MyCard.Suit.DIAMONDS));
        h.addCard(new MyCard(MyCard.Rank.FOUR, MyCard.Suit.SPADES));
        h.addCard(new MyCard(MyCard.Rank.THREE, MyCard.Suit.DIAMONDS));
        h.addCard(new MyCard(MyCard.Rank.SIX, MyCard.Suit.CLUBS));
        h.addCard(new MyCard(MyCard.Rank.FIVE, MyCard.Suit.DIAMONDS));
        h.addCard(new MyCard(MyCard.Rank.TWO, MyCard.Suit.CLUBS));


        //displaying the unsorted hand
        System.out.println();
        System.out.println("New hand contains:");
        h.display();

        //deleting a card
        System.out.println();
        System.out.println("Deleting the three of diamonds.");
        System.out.println(h.deleteCard(MyCard.Rank.THREE,MyCard.Suit.DIAMONDS));

        //displaying the new contents:
        System.out.println();
        System.out.println("Hand now contains:");
        h.display();

        //sorting the hand:
        System.out.println();
        System.out.println("Sorting the deck.");
        h.sort();

        //displaying the new contents:
        System.out.println();
        System.out.println("Sorted hand:");
        h.display();


        //adding a card that already exists to test exception
//        System.out.println();
//        System.out.println("Added a duplicate card to test exception.");
//        h.addCard(new MyCard(MyCard.Rank.TWO, MyCard.Suit.DIAMONDS));
//        System.out.println("Sorted hand with exception thrown:");
//        h.sort();

        //system can also store with:
        System.out.println();
        System.out.println("File named hand.txt created on desktop with the contents of the hand as it currently is.");
        h.store("hand.txt");





    }
}
