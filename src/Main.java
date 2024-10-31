import java.util.*;

public class Main {
    public static void main(String[] args) {
        lists();
    }


    // Funktion utan retur eller inparametrar
    public static void greeting (){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ditt namn: ");
        String input = sc.nextLine();
        System.out.println("Hej " + input);

    }    // Funktion utan retur eller inparametrar
    public static void greeting2 (){

        getStringFromUser();
        String input = getStringFromUser();
        System.out.println("Hej " + input);

    }

    // Funktion med inparametrar
    public static void greetName(String name){

        System.out.println("Hej " + name);


    }

    // Funktion som returnerar ett värde
    public static String getStringFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        return input;
    }

    public static void ifSats(){
        int x = 10;
        int y = 20;
        int z = 30;

        if(x > y && z > y) {
            System.out.println("Påståendet är sant.");
        } else {
            System.out.println("Påståendet är falskt.");
        }

        System.out.println("Detta skrivs alltid ut.");
    }


    // Switch-sats
    public static void switchSats(){
        System.out.println("Pick an alternative");
        System.out.println("1: Say hi!");
        System.out.println("2: Say bye!");
        System.out.println("0: Quit");

        String choice = getStringFromUser();

        int x = 6;

        switch(choice){
            case "1":
                System.out.println("First case is true.");
                break;
            case "2":
                System.out.println("Second case is true.");
                break;
            case "0":
                System.out.println("Closing down....");
                break;
            default:
                System.out.println("No such alternative");
        }
    }



    // Loops
    // for
    // foreach
    // while
    // do-while

    // For loop
    public static void forLoop(){

        for ( int i = 0; i < 10; i+=2){
            System.out.println("i = " + i);
        }

    }

    // while loop
    public static void whileLoop(){
        boolean running = true;
        while(running){
            System.out.println("Looping a while loop");
            System.out.println("Do you want to quit? Y/N");
            String input = getStringFromUser();

            if(input.equals("Y")){
                break;
            }
        }
    }

    // do-while loop
    public static void doWhileLoop(){
        boolean running = true;

        do {
            System.out.println("Looping a while loop");
            System.out.println("Do you want to quit? Y/N");
            String input = getStringFromUser();

            if(input.equals("Y")){
                break;
            }
        } while(running);

    }

    //forEach
    public static void forEach(){
        int[] numbers = {21,564,97,61,694,31,9,6};

        for (int number : numbers) {
            System.out.println(number);
        }

    }

    //Arrays
    public static void arrays(){
        int number = 1;


        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        int[] numbers3 = numbers.clone(); // använd .clone() för att skapa en ny array och inte bara en pekare

//        int[] numbers2 = new int[10];

        numbers3[0] = 10;

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers2[0]);
        System.out.println(numbers3);
        System.out.println(Arrays.toString(numbers3));
//        System.out.println(numbers2[0]);


    }

    // Lists
    public static void lists(){

        HashMap<String, String> playerAsMap = new HashMap<>();
        ArrayList<String> listOfNames = new ArrayList<>();
        HashSet<String> setOfNames = new HashSet<>();

        //Map
        playerAsMap.put("name", "Fredrik");
        playerAsMap.put("STR", "1000000000");
        playerAsMap.put("equippedWeapon", "sword");
        System.out.println("playerAsMap = " + playerAsMap);
        for( String key: playerAsMap.values()){
            System.out.println("key = " + key);
        }
        
        // Set kan inte innehålla dubletter
        setOfNames.add("John");
        setOfNames.add("John");
        setOfNames.add("Bob");
        setOfNames.add("Mary");
        System.out.println("name set = " + setOfNames);
//        for (String name : setOfNames) {
//            if(name.startsWith("B")){
//                System.out.println("name = " + name);
//            }
//        }
//        System.out.println(setOfNames.size());

        listOfNames.add("Harry");
        listOfNames.add("Jack");
        listOfNames.add("Lily");
        listOfNames.add("Nancy");
        listOfNames.add("Bob");
        System.out.println("name list = " + listOfNames);


    }

}