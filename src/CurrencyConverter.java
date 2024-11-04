import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        float dollar = 0.0938f;
        float euro = 0.0866f;

        boolean runProgram = true;
        while (runProgram) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter amount in SEK to be converted: ");
            int amount = input.nextInt();
            input.nextLine();
            float dollarResult = amount * dollar;
            float euroResult = amount * euro;
            System.out.println(amount + " SEK is " + "$" + dollarResult + ".");
            System.out.println(amount + " SEK is " + "€" + euroResult + ".");
            boolean repeat = false;
            do {
                System.out.println("Do you want to perform another conversion? Y/N");
                String answer = input.nextLine();

                if (answer.equals("Y")) {
                    runProgram = true;
                    repeat = false;
                } else if (answer.equals("N")) {
                    runProgram = false;
                    repeat = false;

                } else {
                    repeat = true;
                    System.out.println("Invalid input");
                }}
                while(repeat);
        }


    }
}
