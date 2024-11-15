import java.util.Scanner;

public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean getBoolean(){
        while(true){
            String strInput = scanner.nextLine();
            if(strInput.toLowerCase().startsWith("y")){
                return true;
            }
            if(strInput.toLowerCase().startsWith("n")){
                return false;
            }
            System.out.println("Please enter a valid choice. Y/N ");
        }
    }


    public static String getString(){
        return scanner.nextLine();
    }

    public static int getIntInRange(int min, int max){
        while(true){
            while(!scanner.hasNextInt()){
                System.out.println("Invalid input! Please enter an integer!");
                scanner.nextLine();
            }
            int input = scanner.nextInt();
            if(input >= min && input <= max ){
                scanner.nextLine();
                return input;
            }
            System.out.println("Invalid input! Please enter an integer between " + min + " and " + max);
            scanner.nextLine();
        }
    }

}
