import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static HashMap<String, Double> products = new HashMap<>();
    public static HashSet<String> cartNames = new HashSet<>();
    public static double totalCost = 0;
    public static int totalNumberOfItems = 0;
    public static void main(String[] args) {




        boolean running = true;
        while(running){
            printProducts();
            running =  addToCart();
        }





    }

    //Skriv en funktion printProducts som visar en lista med produkter och deras priser.
    public static void printProducts(){
        products.put("coffee", 64.95);
        products.put("milk", 18.95);
        System.out.println("Available products: ");
        System.out.println(products);
        System.out.println("1 - Coffee: " + products.get("coffee") +  " SEK");
        System.out.println("2 - Milk: " + products.get("milk") + " SEK");
    }

    //Skriv en funktion addToCart som tar produktnamn och pris som argument, och uppdaterar kundkorgen samt den totala kostnaden.
    public static boolean addToCart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number corresponding to the product you would like to add(0 to end): ");
        while(!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Please enter an integer!");
        }
        int input = scanner.nextInt();
        boolean running;
        if(input != 0){
            scanner.nextLine();
            System.out.println("product = " + input);
            if(input == 1){
                cartNames.add("Coffee");
                totalCost += products.get("coffee");
            }

            running = true;
        } else{
            running = false;
        }

        System.out.println(cartNames);
        System.out.println(totalCost);
        System.out.println("----------");
        return running;
    }

    //Skriv en funktion viewCart som visar alla produkter i kundkorgen och den totala kostnaden.
    public static void viewCart(){

    }


}



//TODO Skapa ett enkelt program som simulerar ett mycket grundläggande shoppingsystem. Programmet ska innehålla
// funktionalitet för att visa en produktlista, lägga till produkter till en kundkorg, och visa den totala kostnaden.

// TODO Steg 1: Variabler och datatyper
//Deklarera några variabler för att representera olika produkter och deras priser (t.ex., int eller double).
//Skapa variabler för att hålla reda på den totala kostnaden samt antalet produkter i kundkorgen.

// TODO Steg 2: Funktioner


//
// TODO Steg 3: Loopar och villkor
//Använd en while-loop som låter användaren välja en produkt från listan genom att ange ett nummer. Om användaren anger ett ogiltigt val ska de få ett felmeddelande.
//Lägg till en möjlighet för användaren att avsluta shoppingen genom att skriva "0".
//
// TODO Steg 4: Array/Listor
//Använd en array eller ArrayList för att lagra produkterna och deras priser.
//Lägg till alla valda produkter i kundkorgen.
//
//
//
//
//Bonus
//lägg till fler produkter och justera priserna.
//skapa ytterligare en funktion, till exempel för att ta bort produkter från kundkorgen.