import java.util.ArrayList;

public class Suits {
    private ArrayList<String> suits =  new ArrayList<>();


    public void setSuits() {
        suits.add("Hearts");
        suits.add("Diamonds");
        suits.add("Clubs");
        suits.add("Spades");
    }

    public String getSuits(int i) {
        return this.suits.get(i);
    }
}
