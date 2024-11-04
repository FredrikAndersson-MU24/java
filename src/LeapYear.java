import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        boolean run = true;
        while(run){
            System.out.println("Please enter a year to find out if it is a leap year or not: ");
            Scanner scanner = new Scanner(System.in);
            while(!scanner.hasNextInt()){
                scanner.nextLine();
                System.out.println("Please enter a valid year with four digits(YYYY)");
            }
            int year = scanner.nextInt();
            scanner.nextLine();

            if( year % 4 == 0){
                System.out.println(year + " is a leap year");
            } else{
                System.out.println(year + " is not a leap year");}
            System.out.println("Do you want to enter another year?");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("y")){
                run = true;
            } else if(input.equalsIgnoreCase("n")){
                run = false;
            } else {
                System.out.println("Please enter a valid option");
            }
        }


    }
}
