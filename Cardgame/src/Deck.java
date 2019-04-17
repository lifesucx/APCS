import java.util.ArrayList;

public class Deck {
    //The fields
    private ArrayList<Card> discard;
    private ArrayList<Card> deck;

    //main class, makes it possible to test the print cards class
    public static void main(String[] args) {
        new Deck().printCards();
    }

    //Creating a deck that will create the deck in order
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

    //prints the deck
    //mainly to test the deck class works
    public void printCards() {
        System.out.println(deck);
    }

    //deals the card that is on top
    public Card dealCard(){
        if(deck.size() > 0){
            Card res = deck.remove(0);
            discard.add(res);
            return res;
        }else{
            return res;
        }
    }

    //shuffles the cards
    private void shuffle(){

    }

}