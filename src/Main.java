import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> points = new ArrayList<>();
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        scores();
    }

    public static void scores(){
        Scanner scanner = new Scanner(System.in);
        inputScores(scanner);
        highestScore(points);
        averageScore(points);
    }

    public static void inputScores(Scanner scanner) {
        boolean run = true;
        while(run){
            System.out.println("Enter score (-1 to exit): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer.");
                scanner.nextLine();
            }
            int input = scanner.nextInt();
            scanner.nextLine();
            if(input == -1) {
                run = false;
            }else{
                points.add(input);
            }
        }
    }


    public static void highestScore(ArrayList<Integer> points) {
        if(points.isEmpty()){
            System.out.println("No scores entered!");
            return;
        }
        int highestScore = 0;
        for(Integer point : points){
            if(point > highestScore){
                highestScore = point;
            }
        }
        System.out.println("The highest score is " + highestScore + ".");
    }

    public static void averageScore(ArrayList<Integer> points) {
        double totalScore = 0;
        for(Integer point : points){
            totalScore += point;
        }
        double averageScore = totalScore / points.size();
        System.out.println("The average score is " + averageScore + ".");
    }
}

//Todo Övning 1: Poängberäkning i en tävling
//Skapa en enkel applikation som låter användaren mata in poäng för deltagare i en tävling och sedan beräkna och visa genomsnittspoängen och den högsta poängen.
//
//Skapa en datastruktur:
//Fundera över hur du vill lagra poängen för deltagarna. Du kan använda en ArrayList av heltal.
//
//*Användarinmatning:
//Implementera en mekanism för att låta användaren mata in poängen för varje deltagare. Det kan vara en enkel textbaserad användargränssnitt med en loop som upprepas tills användaren väljer att sluta mata in poäng.
//
//*Lagra poängen:
//För varje inmatning ska du lagra poängen i den valda datastrukturen.
//
//*Beräkna högsta poängen:
//Använd en loop för att hitta den högsta poängen bland alla deltagare.
//
//*Beräkna genomsnittspoängen:
//Använd en loop för att räkna ut den genomsnittliga poängen för alla deltagare.
//
//*Visa resultatet:
//Presentera den högsta poängen och genomsnittspoängen för användaren, så att de kan se resultatet av tävlingen.
//
//*Avslutningsalternativ:
//Ge användaren möjlighet att avsluta applikationen när de är nöjda med att mata in poäng.
//
//Övning 2:
//Du har en lista av heltal. Din uppgift är att skapa en funktion eller algoritm som hittar det största unika talet i listan. Ett unikt tal är ett tal som bara förekommer en gång i listan. Om det inte finns något unikt tal ska funktionen returnera ett meddelande om detta. Skapa även en funktion som skapar upp en lista med många tal som du kan testa med.