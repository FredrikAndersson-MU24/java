import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {
    public static ArrayList<Cards> cards = new ArrayList<>();


    public ArrayList<Cards> newDeckOfCards(){
//        DeckOfCards deck = new DeckOfCards();
        generateDeckOfCards();
        return shuffleDeck();
    }

    public void generateDeckOfCards() {
        Suits suit = new Suits();
        Numbers numbers = new Numbers();
        suit.setSuits();
        numbers.generateNumbers();
        for(int i = 0; i < 4 ; i++){
            for(int j = 0; j <=12 ; j++){
                cards.add(new Cards(suit.getSuits(i),numbers.getNumber(j)));
            }
        }

    }

    public ArrayList<Cards> shuffleDeck(){
        Random randomNumber = new Random();
        ArrayList<Cards> index = new ArrayList<>();
        int randomIndex;
        ArrayList<Integer> rNumbers = new ArrayList<>();
        for(int i = 0; i < cards.size(); i++){
            do {
                randomIndex = randomNumber.nextInt(cards.size());
            } while (index.contains(cards.get(randomIndex)));
            rNumbers.add(randomIndex);
            index.add(cards.get(randomIndex));
        }
        System.out.println("index = " + rNumbers);
        rNumbers.sort(Integer::compareTo);
        System.out.println("index = " + rNumbers);
        return index;
    }



}
