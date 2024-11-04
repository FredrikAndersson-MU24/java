import java.util.Scanner;

public class UnitConversion {

    public static void main(String[] args) {


        int famnarInCm = 178; //178 cm
        double alnarInCm = 59.4; //59,4 cm
        double tumInCm = 2.54; //2,54 cm

        boolean runProgram = true;
        while(runProgram){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ange antal famnar: ");
            int famnar = scanner.nextInt();
            scanner.nextLine();


            System.out.println("Ange antal alnar: ");
            int alnar = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ange antal tum: ");
            int tum = scanner.nextInt();
            scanner.nextLine();

            double result = famnar * famnarInCm + alnar * alnarInCm + tum * tumInCm;

            System.out.println("Det blir totalt " + result + " cm.");
            boolean end = false;
            while(!end){
                System.out.println("Vill du göra en ny konvertering? Y/N");
                String repeat = scanner.nextLine();
                if (repeat.equals("N") || repeat.equals("n")) {
                    runProgram = false;
                    end = true;
                }else if (repeat.equals("Y") || repeat.equals("y")) {
                    end = true;
                } else {
                    System.out.println("Felaktigt val!");
                }

            }



        }


    }
}
