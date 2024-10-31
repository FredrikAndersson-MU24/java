import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static HashMap<String, Double> products = new HashMap<>();
    public static double totalCost = 0;
    public static HashMap<String, Integer> totalNumberOfItems = new HashMap<>();
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
        products.put("bread", 10.95);
        System.out.println("Available products: ");
        System.out.println("1 - Coffee: " + products.get("coffee") +  " SEK");
        System.out.println("2 - Milk: " + products.get("milk") + " SEK");
        System.out.println("3 - Bread: " + products.get("bread") + " SEK");
    }

    //Skriv en funktion addToCart som tar produktnamn och pris som argument, och uppdaterar kundkorgen samt den totala kostnaden.
    public static boolean addToCart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select items from the menu (10 to view cart, 0 to check-out): ");
        while(!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Please enter an integer!");
        }
        int input = scanner.nextInt();
        scanner.nextLine();
        boolean running = true;
        String product = "";
        switch (input){
            case 0:
                running = false;
                viewCart();
                break;
            case 1:
                product = "coffee";
//                totalCost += products.get("coffee");
//                totalNumberOfItems.put("Coffee", (totalNumberOfItems.get("Coffee") != null ? totalNumberOfItems.get("Coffee")+1 : 1));
                break;
            case 2:
                product = "milk";
                break;
            case 3:
                product = "bread";
                break;
            case 10:
                viewCart();
                break;
            default:
                System.out.println("Please enter a valid option!");
        }
        if (running && input != 10){
            totalCost += products.get(product);
            totalNumberOfItems.put(product.toUpperCase(), (totalNumberOfItems.get(product.toUpperCase()) != null ? totalNumberOfItems.get(product.toUpperCase())+1 : 1));
        }

        return running;
    }

    //Skriv en funktion viewCart som visar alla produkter i kundkorgen och den totala kostnaden.
    public static void viewCart(){
        if(totalNumberOfItems.isEmpty()) {
            System.out.println("-----------------------------");
            System.out.println("Shopping cart is empty!");
            System.out.println("-----------------------------");
        }else{
            System.out.println("-----------------------------");
            System.out.println("|\t\tShopping cart\t\t|");
            System.out.println("| Item\t\t\t\tQty\t\t|");
            for (String key : totalNumberOfItems.keySet()) {
                System.out.println("| " + key + "  \t\t\t" + totalNumberOfItems.get(key) + "\t\t|");
            }
            System.out.println("-----------------------------");
            System.out.println("| Total:\t\t" + totalCost + " SEK\t|");
            System.out.println("-----------------------------");
        }
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