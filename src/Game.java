import java.util.ArrayList;

public class Game {
    public static ArrayList<Cards> cards = new ArrayList<>();

    public void game(){
        initializeDeck();





    }

    public void initializeDeck(){
        DeckOfCards deck = new DeckOfCards();
        cards = deck.newDeckOfCards();
    }



}
