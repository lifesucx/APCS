import java.util.ArrayList;

public class Deck{
    // private static final int[] Deck = null;
    private ArrayList<Card> deck;
    private ArrayList<Card> discard;
    public Deck(){
        //initializing deck and discard
        this.deck = new ArrayList<>();
        this.discard = new ArrayList<>();
        //creating the actual deck
        for(int suit = Card.CLUBS; suit <= Card.SPADES; suit++){
            for(int rank = Card.ACE; rank <= Card.KING; rank++){
                deck.add(new Card(rank, suit));
            }
    }
}

    //This is what makes the add work
    // private int[] add(int[] card, int[] Deck) {
    //     return null;
    //}

    //next we need the shuffle class
    public static shuffleDeck(){

    }
}