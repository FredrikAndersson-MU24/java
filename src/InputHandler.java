import java.util.Scanner;

public class InputHandler {

    private static Scanner scanner = new Scanner(System.in);

    public static int getIntInRange(int min, int max){
        while(true){
            while(!scanner.hasNextInt()){
                System.out.println("Invalid input. Please enter an integer!");
                scanner.nextLine();
            }
            int input = scanner.nextInt();
            if(input >= min && input <= max){
                scanner.nextLine();
                return input;
            }
            System.out.println("Please enter a number between " + min + " and " + max);
            scanner.nextLine();
        }
    }


    public  String getString(){
        return scanner.nextLine();
    }
}
