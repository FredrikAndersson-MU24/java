import java.util.ArrayList;

public class Cards {
    private final String suit;
    private final int number;

        public Cards(String suit, int number) {
            this.suit = suit;
            this.number = number;
        }

    @Override
    public String toString() {
        return  "\nSuit: " + suit +
                "\nNumber: " + number;
    }
}
