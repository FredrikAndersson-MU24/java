import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        shoppingList(scanner);
    }



    public static void shoppingList(Scanner scanner){
        String[] listOfProducts = new String[10];

            System.out.println("What do you want to add to the list? (Enter done to exit)");
            for(int i = 0; i <= 9; i++){
                String input = scanner.nextLine();
                if(!input.equals("done")){
                    listOfProducts[i] = input;
                }else{
                    for( String item : listOfProducts){
                        if(item != null){
                            System.out.println(item);
                        }
                    }
                    return;
                }

            }

    }

    public static void listOfProducts(Scanner scanner){

    }





    public static void names(Scanner scanner){
        int numberOfNames = howManyNames(scanner);
        String[] names = new String[numberOfNames];
        enterNames(scanner, names, numberOfNames);
        printingNames(names);
        printingNamesBackwards(names);
    }

    public static Integer howManyNames(Scanner scanner){
        System.out.println("How many names do you want to enter?");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static void enterNames(Scanner scanner, String[] names, Integer numberOfNames){
        System.out.println("Enter " + numberOfNames + " names: ");
        for( int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }
    }

    public static void printingNames(String[] names){
        for(String name : names) {
            System.out.println("name = " + name);
        }
    }

    public static void printingNamesBackwards(String[] names){
        String[] namesBackward = names.clone();
        for (int j = 0; j < namesBackward.length; j++) {
            char[] chars = names[j].toCharArray();
            char[] newChars = new char[chars.length];
            for (int i = 0; i < chars.length; i++) {
                newChars[i] = chars[chars.length-1-i];
            }
            String element = new String(newChars);
            namesBackward[j] = element;
        }
        for( String name : namesBackward ) {
            System.out.println("name backwards = " + name);
        }
    }


}

// TODO Array övningar
//Level up
//Ifall användaren skriver in fler än 10 produkter ska programmet fråga vilken vara användaren vill ersätta den nya varan med.