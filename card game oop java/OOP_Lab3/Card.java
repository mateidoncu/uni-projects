package OOP_Lab3;

public class Card {

    public enum Rank {
        ACE, TWO, THREE, FOUR,
        FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, KNIGHT, QUEEN, KING,
        JOKER
    }

    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        setRank(rank);
        setSuit(suit);
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setRank(Rank rank) {
        if (rank == null)
            throw new RuntimeException("Suit must be non-null");
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        if (suit == null)
            throw new RuntimeException("Suit must be non-null");
        this.suit = suit;
    }

}
