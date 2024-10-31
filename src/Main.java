import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int playerScore = 0;
    public static int cpuScore = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};
        boolean running = true;
        while (running) {
            printMenu();
            System.out.println("Make your choice.");
            int userChoice = getIntInRange(1, 3, scanner);
            int cpuChoice = cpuChoice();

            System.out.println("User chose = " + choices[userChoice-1]);
            System.out.println("CPU chose = " + choices[cpuChoice-1]);

            System.out.println(checkRoundWinner(userChoice, cpuChoice));

            running = checkGameWinner(scanner);
        }

    }

    public static boolean getYesOrNo(Scanner scanner){

        while(true){
            if(scanner.nextLine().toLowerCase().startsWith("y") || scanner.next().toLowerCase().startsWith("j")){
                return true;
            }
            if(scanner.nextLine().toLowerCase().startsWith("n")){
                return false;
            }
            System.out.println("Please enter Y(es) or N(o)");
        }
    }


    public static boolean checkGameWinner(Scanner scanner){
        if(playerScore == 3){
            System.out.println("Congratulations! You won " + playerScore + " - " + cpuScore );
            System.out.println("Play again?");
            playerScore = 0;
            cpuScore = 0;
            return getYesOrNo(scanner);
        }
        if(cpuScore == 3){
            System.out.println("You lost " + cpuScore + " - " + playerScore );
            System.out.println("Play again?");
            playerScore = 0;
            cpuScore = 0;
            return getYesOrNo(scanner);
        }
        return true;
    }


    public static int getIntInRange(int min, int max, Scanner scanner){

        while(true){
            while(!scanner.hasNextInt()){
                System.out.println("Invalid input. Enter a number between 1 and 3.");
                scanner.nextLine();
            }
            int input = scanner.nextInt();
            scanner.nextLine();
            if(input >= min && input <= max){
                return input;
            }
            System.out.println("Pick a valid number");
        }
    }

    public static void printMenu(){
        System.out.println("Playerscore: " + playerScore);
        System.out.println("CPUscore: " + cpuScore);
        System.out.println("----------");
        System.out.println("Choose by entering a number.");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
    }

    public static int cpuChoice(){
        Random random = new Random();
        int choice = random.nextInt(1, 4);

        return choice;

    }

    public static String checkRoundWinner(int player, int cpu) {

        String winner;
        if(cpu - player == 2 || cpu - player == -1){
            winner = "player";
            playerScore++;
        } else if ( cpu == player){
            winner ="draw";
        } else {
            winner ="cpu";
            cpuScore++;
        }
        return winner;

    }

}



//TODO ett coolt spel

//TODO en spelare får välja sten, sax eller påse

//TODO datorn väljer sten, sax eller påse

//TODO spelet ska avgöra vem som vinner

//TODO spelet håller reda på vinster och förluster

//Todo spelet frågar om vi vill avsluta