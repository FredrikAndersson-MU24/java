import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

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
