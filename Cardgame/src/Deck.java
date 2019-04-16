import java.util.ArrayList;

public class Deck {
    // private static final int[] Deck = null;
    private ArrayList<Card> discard;
    public static void main(String[] args) {
        new Deck().printCards();
    }

    private ArrayList<Card> deck;


    // private String res() {
    // }

    public Deck() {
        //initializing deck and discard
        this.deck = new ArrayList<>();
        this.discard = new ArrayList<>();
        //creating the actual deck
        for (int suit = Card.CLUBS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    //This is what makes the add work
    // private int[] add(int[] card, int[] Deck) {
    //     return null;
    //}

    //next we need the shuffle class
    // public static shuffleDeck(){

    // }

    public void printCards() {
        System.out.println(deck);
    }


    public Card dealCard(){
        if(deck.size() > 0){
            Card res = deck.remove(0);
            discard.add(res);
            return res;
        }else{
            return res;
        }
    }

}