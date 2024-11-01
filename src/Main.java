import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static ArrayList<Double> productPrices = new ArrayList<>();
    public static ArrayList<String> productNames = new ArrayList<>();

    public static HashMap<String, Double> products = new HashMap<>();
    public static double totalCost = 0;
    public static HashMap<String, Integer> shoppingCart = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        availableProducts();
        while(running){
            printProducts();
            running =  menuSelection(scanner);
        }
    }

    // En funktion för att sätta upp listor med produkter och deras priser
    public static void availableProducts(){
        productNames.add("coffee");
        productPrices.add(64.95);

        productNames.add("milk");
        productPrices.add(18.95);

        productNames.add("bread");
        productPrices.add(10.95);

        productNames.add("cheese");
        productPrices.add(99.95);

        productNames.add("bacon");
        productPrices.add(39.95);
    }

    //Skriv en funktion printProducts som visar en lista med produkter och deras priser.
    public static void printProducts(){
        System.out.println("Available products: ");
        for(int i = 0; i < productNames.size(); i++){
            System.out.println(i+1 + " - " +productNames.get(i).toUpperCase() + ": " + productPrices.get(i) + " SEK");
        }
//        products.put("coffee", 64.95);
//        products.put("milk", 18.95);
//        products.put("bread", 10.95);
//        System.out.println("Available products: ");
//        System.out.println("1 - Coffee: " + products.get("coffee") +  " SEK");
//        System.out.println("2 - Milk: " + products.get("milk") + " SEK");
//        System.out.println("3 - Bread: " + products.get("bread") + " SEK");
    }

    //Skriv en funktion addToCart som tar produktnamn och pris som argument, och uppdaterar kundkorgen samt den totala kostnaden.
    public static boolean menuSelection(Scanner scanner){
        System.out.println("Please select items from the menu (10 to view cart, 0 to check-out): ");
        while(!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Please enter an integer!");
        }
        int input = scanner.nextInt();
        scanner.nextLine();
        boolean running = true;

        if(input == 0){
            viewCart();
            running = false;
        } else if(input == 10){
            viewCart();
        } else if(input == -10){
            if(!shoppingCart.isEmpty()){
                viewCart();
                removeFromCart(scanner);
            }else{
                System.out.println("Shopping cart is already empty.");

            }

        }else if(input <= productNames.size()){
            addToCart(input - 1);
        } else {
            System.out.println("Please enter a valid number!");
        }

//        switch (input){
//            case 0:
//                running = false;
//                viewCart();
//                break;
//            case 1:
//                addToCart(input - 1);
//                break;
//            case 2:
//                addToCart(input - 1);
//                break;
//            case 3:
//                addToCart(input - 1);
//                break;
//            case 10:
//                viewCart();
//                break;
//            default:
//                System.out.println("Please enter a valid option!");
//        }
        return running;
    }

    //Skriv en funktion addToCart som tar produktnamn och pris som argument, och uppdaterar kundkorgen samt den totala kostnaden.
    public static void addToCart(int input){
        String productToAdd = productNames.get(input).toUpperCase();
        totalCost += productPrices.get(input);
        shoppingCart.put(productToAdd, (shoppingCart.get(productToAdd) == null ? 1 : shoppingCart.get(productToAdd) + 1 ));
//            totalCost += products.get(product);
//            shoppingCart.put(product.toUpperCase(), (shoppingCart.get(product.toUpperCase()) != null ? shoppingCart.get(product.toUpperCase())+1 : 1));
    }

    //Skriv en funktion viewCart som visar alla produkter i kundkorgen och den totala kostnaden.
    public static void viewCart(){
        DecimalFormat df = new DecimalFormat("0.00");
        df.setMaximumFractionDigits(2);
        if(shoppingCart.isEmpty()) {
            System.out.println("-----------------------------");
            System.out.println("|  Shopping cart is empty!  |");
            System.out.println("-----------------------------");
        }else{
            System.out.println("-----------------------------");
            System.out.println("|\t\tShopping cart\t\t|");
            System.out.println("| Pos\t\tItem\t\tQty\t\t|");
            for (String key : shoppingCart.keySet()) {
                int pos = productNames.indexOf(key.toLowerCase()) +1;
                System.out.println("| " + pos + "\t\t\t" + key + " \t\t" + shoppingCart.get(key) + "\t\t|");
            }
            System.out.println("-----------------------------");
            System.out.println("| Total:\t\t" + df.format(totalCost)  + " SEK\t|");
            System.out.println("-----------------------------");
        }
    }





    public static boolean menu(Scanner scanner){
        System.out.println("What do you want to do?: ");
        System.out.println("1. Add product");
        System.out.println("2. Remove product");
        System.out.println("3. Show all products");
        System.out.println("4. Checkout");
        while(!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Please enter an integer!");
        }
        int input = scanner.nextInt();
        scanner.nextLine();
        boolean running = true;
        switch (input){
            case 0:
                running = false;
                viewCart();
                break;
            case 1:
                addToCart(input - 1);
                break;
            case 2:
                addToCart(input - 1);
                break;
            case 3:
                addToCart(input - 1);
                break;
            case 10:
                viewCart();
                break;
            default:
                System.out.println("Please enter a valid option!");
        }
        return running;
    }









    public static void removeFromCart(Scanner scanner){
        System.out.println("Please select items you want to remove: ");
        while(!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Please enter an integer!");
        }
        int input = scanner.nextInt() -1;
        scanner.nextLine();
        String productToRemove = productNames.get(input).toUpperCase();
        totalCost -= shoppingCart.get(productToRemove) * productPrices.get(input);
        shoppingCart.remove(productToRemove);


        // TODO Ta in vilken post som ska tas bort. Multiplicera antalet med styckpris och dra bort detta från totalCost. Ta bort posten från shoppingCart.
        //
    }










}


//
//Bonus
//lägg till fler produkter och justera priserna.
//skapa ytterligare en funktion, till exempel för att ta bort produkter från kundkorgen.