import java.util.Scanner;

public class Game {




    private Player player1;
    private Player player2;
    private Combat combat;

    public Game(){

        while(true){
            printMenu();
            int input = getIntFromInput();
            if (input == 2){
                break;
            }

            if (input == 1){

                Combat combat = new Combat(new Player("John"), new Player("Jake"));
                combat.combatLoop();
            }
        }

    }


    public void printMenu(){
        System.out.println("What do you want to do?");
        System.out.println(" 1 - Play");
        System.out.println(" 2 - Quit");

    }

    public int getIntFromInput (){
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
            System.out.println("Please enter a number");
            scanner.nextLine();
        }
        int i = scanner.nextInt();
        scanner.nextLine();
        return i;
    }



}
