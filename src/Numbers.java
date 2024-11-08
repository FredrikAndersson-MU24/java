import java.util.ArrayList;

public class Numbers {
    private ArrayList<Integer> number = new ArrayList<>();

    public void generateNumbers(){
//        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 2; i <= 14; i++ ){
            number.add(i);
        }
//        this.number = numbers;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "number=" + number +
                '}';
    }

    public int getNumber(int i) {
        return number.get(i);
    }
}
