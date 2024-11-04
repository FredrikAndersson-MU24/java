import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static HashMap<String, ArrayList<String>> dictionary = new HashMap<>();
    public static ArrayList<String> hej = new ArrayList<>();
    public static ArrayList<String> middag = new ArrayList<>();
    public static ArrayList<String> fantastiskt = new ArrayList<>();
    public static HashMap<String, Long> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dictionary();
        searchDictionary(scanner);
    }

    public static void dictionary() {
        hej.add("hey");
        hej.add("hello");
        hej.add("hi" );

        middag.add("dinner");
        middag.add("supper");

        fantastiskt.add("fantastic");
        fantastiskt.add("great");

        dictionary.put("hej", hej);
        dictionary.put("middag", middag);
        dictionary.put("fantastiskt", fantastiskt);

    }

    public static void searchDictionary(Scanner scanner){
        System.out.println("Vad vill du översätta?");
        String input = scanner.nextLine();
//        String[] output = dictionary.get(input);
        System.out.println(input + " = " + dictionary.get(input));
    }

    public static void phonebook(Scanner scanner){
        phoneBook.put("Adam", 4440785220L);
        phoneBook.put("Bert", 3021465987L);
        phoneBook.put("Curt", 25840404610L);
        boolean run = true;
        while(run){
            run = menuSelection(scanner, run);
        }
    }

    public static boolean menuSelection(Scanner scanner, Boolean run){
        System.out.println("What do you want to do?");
        System.out.println("1. Search the phone book");
        System.out.println("2. Add an entry to the phone book");
        System.out.println("3. Show all phone book entries");
        System.out.println("4. Quit");
        while(!scanner.hasNextInt()){
            scanner.next();
            System.out.println("please enter an integer!");
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice == 1){
            searchPhoneBook(scanner);
        } else if(choice == 2){
            addEntryToPhoneBook(scanner);
        } else if(choice == 3){
            showPhonebook();
        } else if(choice == 4){
            run = false;
        }else {
            System.out.println("Please enter a valid option!");
        }
        return run;
    }

    public static void searchPhoneBook(Scanner scanner){
        System.out.println("Please enter a name to search the phonebook: ");
        String input = scanner.nextLine();
        if(phoneBook.containsKey(input)) {
            System.out.println(phoneBook.get(input));

        }else{
            System.out.println(input + " not found.");
        }
    }
    public static void addEntryToPhoneBook(Scanner scanner){
        System.out.println("Please enter a name to add: ");
        String newName = scanner.nextLine();
        System.out.println("Please enter " + newName + "'s phone number: ");
        while(!scanner.hasNextLong()){
            scanner.next();
            System.out.println("Please enter a valid phone number: ");
        }
        long newNumber = scanner.nextLong();
        phoneBook.put(newName, newNumber);
    }

    public static void showPhonebook(){
        for(String key : phoneBook.keySet()){
            System.out.println(key + " : " + phoneBook.get(key));
        }
    }
}

//Map övningar
//Övning 1 - Telefonlista

//
//Övning 2 - Lexicon
//Skapa en dictionary som har svenska ord som nyckel och engelska ord som värde
//
//key	value
//hej	hello
//middag	dinner
//fantastiskt	fantastic
//Level up
//Gör så att dictionary:n även visar synonymer i översättningen genom att använda en lista av synonymer som value.
//
//        key	value
//hej	[hey, hello, hi]
//middag	[dinner, supper]
//fantastiskt	[fantastic, great]