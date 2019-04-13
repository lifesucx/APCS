public class Card implements Comparable<Card>{
    //suits
    public final static int CLUBS = 0;
    public final static int DIAMONDS = 1;
    public final static int HEARTS = 2;
    public final static int SPADES = 3;

    //ranks
    public final static int ACE = 0;
    public final static int TWO = 1;
    public final static int THREE = 2;
    public final static int FOUR = 3;
    public final static int FIVE = 4;
    public final static int SIX = 5;
    public final static int SEVEN = 6;
    public final static int EIGHT = 7;
    public final static int NINE = 8;
    public final static int TEN = 9;
    public final static int JACK = 10;
    public final static int QUEEN = 11;
    public final static int KING = 12;

    private final int rank;
    private final int suit;

    //setting up cards
    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }

    //get suit
    public int getSuit(){
        return suit;
    }

    //get rank
    public int getRank(){
        return rank;
    }

    //In the game all of the face cards are worth ten
    //rank +1 because arrays start at 0
    //gets the value of the card drawn
    public int getValue(){
        if(rank < JACK){
            return rank + 1;
        }else{
            return 10;
        }
    }

    //Changing things to strings
    public String toString(){
        //making a string
        String res = "";
        //changing the rank to a string
        if(rank == ACE) res += "Ace";
        else if(rank == TWO) res += "Two";
        else if(rank == THREE) res += "Three";
        else if(rank == FOUR) res += "Four";
        else if(rank == FIVE) res += "Five";
        else if(rank == SIX) res += "Six";
        else if(rank == SEVEN) res += "Seven";
        else if(rank == EIGHT) res += "Eight";
        else if(rank == NINE) res += "Nine";
        else if(rank == TEN) res += "Ten";
        else if(rank == JACK) res += "Jack";
        else if(rank == QUEEN) res += "Queen";
        else if(rank == KING) res += "King";

        //just to make it more readible for the user
        res += " of ";

        //Changing the suit to a string
        if(suit == CLUBS) res += "Clubs";
        else if(suit == DIAMONDS) res += "Diamonds";
        else if(suit == HEARTS) res += "Hearts";
        else if(suit == SPADES) res += "Spades";

        return res;
    }

    //Comparing cards, so you do not draw the same card over and over
    public int compareTo(Card other){
        return this.rank - other.rank;
    }

	public static void add(String deck) {
	}
}