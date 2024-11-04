import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Random number = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            int randNum = menu(scanner, number);
            guess(scanner,  randNum);
        }
    }

    public static Integer menu(Scanner scanner, Random number) {
        System.out.println("Choose difficulty: ");
        System.out.println("1. Easy (1-10)");
        System.out.println("2. Medium (1-100)");
        System.out.println("3. Hard (1-1000)");
        while(!scanner.hasNextInt()){
            System.out.println("Please enter a valid number: ");
        }
        int randomNumber = 0;
        int choice = scanner.nextInt();
        scanner.nextLine();
        if ( choice >= 1 && choice <= 3){
            randomNumber = generateNumber(choice, number);
        }  else {
            System.out.println("Please enter a valid number: ");
        }
        return randomNumber;
    }

    public static Integer generateNumber(int choice, Random number){
        int randNum = 1;
        switch (choice) {
            case 1:
                randNum = number.nextInt(1, 10);
                System.out.println("numbers = " + randNum);
                return randNum;
//                break;
            case 2:
                randNum = number.nextInt(1,100);
                System.out.println("numbers = " + randNum);
                return randNum;
//                break;
            case 3:
                randNum = number.nextInt(1,1000);
                System.out.println("numbers = " + randNum);
                return randNum;
//                break;
        }
        return randNum;
    }

    public static void guess(Scanner scanner, Integer number){

//        boolean run = true;
        while(true){
            System.out.println("Please enter your guess: ");
            while(!scanner.hasNextInt()){
                System.out.println("Please enter an integer");
            }
            int guess = scanner.nextInt();
            scanner.nextLine();
            if(guess == number){
                System.out.println(" ----- Congratulations! You guessed it! ----- ");
                break;
            } else if(guess < number){
                System.out.println("Your guess is too low!");

            } else if(guess > number){
                System.out.println("Your guess is too high!");

            }
        }

    }
}
