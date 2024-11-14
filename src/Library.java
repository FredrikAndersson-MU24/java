import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library{
    private final List<Media> medias = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();
    public static boolean running = true;
    public static Member currentVisitor;

    public Library(){
        initMediaList();
        createMembersList();
        login();
        while(running){

            printMenu();
        }

    }

    public void run(){

            Member mem = new MemberReg("Fred");

            System.out.println(medias.toString());



    }

    public void initMediaList(){
        medias.add(new Book("Lister", 1985, 200));
        medias.add(new Magazine("Twister", 1985, "MagaZineCo", 80));
        medias.add((new Film("The Shining", 1980, 130)));
        medias.add(new Book("Gardening", 1985, 200));
        medias.add(new Magazine("Cars", 1985, "MagaZineCo", 80));
        medias.add((new Film("Bloopers", 1980, 130)));
        medias.add(new Book("Relax", 1985, 200));
        medias.add(new Magazine("Hobbies", 1985, "MagaZineCo", 80));
        medias.add((new Film("Batman", 1980, 130)));
        medias.add(new Book("Hang on", 1985, 200));
        medias.add(new Magazine("Business Week", 1985, "MagaZineCo", 80));
        medias.add((new Film("Robin", 1980, 130)));
        medias.add(new Book("The Key To Success", 1985, 200));
        medias.add(new Magazine("Successful", 1985, "MagaZineCo", 80));
        medias.add((new Film("Hero", 1980, 130)));
        medias.add(new Book("Cooking in the 22nd century", 1985, 200));
        medias.add(new Magazine("Dressed", 1985, "MagaZineCo", 80));
        medias.add((new Film("How to fish", 1980, 130)));
        medias.add(new Book("Sowing", 1985, 200));
        medias.add(new Magazine("This Week In Weaving", 1985, "MagaZineCo", 80));
        medias.add((new Film("After Dark", 1980, 130)));
        medias.add(new Book("Bread", 1985, 200));
        medias.add(new Magazine("Meat Loaf", 1985, "MagaZineCo", 80));
        medias.add((new Film("Karl", 1980, 130)));
    }

    public void printMenu(){
        System.out.println("Welcome to the Library");
        System.out.println("What do you want to do?");
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. Film");
        System.out.println("4. Check my active loans.");
        System.out.println("5. Lend an item.");
        System.out.println("0. Leave");
        int choice = InputHandler.getIntInRange(0,5);
        switch(choice){
            case 1:
                listBooks();
                break;
            case 2:
                listMagazines();
                break;
            case 3:
                listFilms();
                break;
            case 4:
                checkLoans();
                break;
            case 5:
                lend();
                break;
            case 0:
                System.out.println("Thank you for visiting the library");
                running = false;
                break;

        }
    }

    public void createMembersList(){
        members.add(new MemberReg("Fred"));
        members.add(new MemberReg("John"));
        members.add(new MemberReg("Mary"));
        members.add(new MemberReg("Bob"));
        members.add(new MemberReg("Jane"));
        members.add(new MemberVIP("Karl"));
        members.add(new MemberVIP("Jan"));
        members.add(new MemberVIP("Kurt"));
        members.add(new MemberVIP("Ned"));
        members.add(new MemberVIP("Liz"));
        members.forEach(System.out::println);
        }

    public void checkLoans(){
        if(currentVisitor.getLoans().isEmpty()){
            System.out.println("\nNo active loans");
        } else {
            System.out.println("\nYou have " + currentVisitor.getLoans().size() + " active loans");
            currentVisitor.getLoans().forEach(System.out::println);}
        }

    public void lend(){
        System.out.println("Please enter the name of the item you wish to lend: ");
        String input = InputHandler.getString();
        int index = 0;
        for (Media m : medias) {
            if(m.getTitle().equals(input)){
                index = medias.indexOf(m);
            }
        }
        System.out.println("index = " + index);
        currentVisitor.loans.add(new Loan(input, medias.get(index)));

    }





    public void listBooks(){
        for(Media media : medias){
            if(media instanceof Book){
                System.out.println(media);
            }
        }
    }

    public void listFilms(){
        for(Media media : medias){
            if(media instanceof Film){
                System.out.println(media);
            }
        }
    }

    public void listMagazines(){
        for(Media media : medias){
            if(media instanceof Magazine){
                System.out.println(media);
            }
        }
    }

    public void login(){
        System.out.println("Welcome to the Library");
        System.out.println("Please enter your name: ");
        String input = InputHandler.getString();
        boolean isMember = false;
        for(Member member : members){
            if(member.getName().equals(input)){
                isMember = true;
                break;
            } else {
                isMember = false;

            }
        }
        if(isMember){
            System.out.println("You are a member");
            setCurrentVisitor(input);
        } else {
            System.out.println("You are not a member yet.");
        }

    }

    public void setCurrentVisitor(String member){
        int index = 0;
        for (Member mem : members) {
            if(mem.getName().equals(member)){
                index = members.indexOf(mem);
            }
        }
        System.out.println("index = " + index);
        currentVisitor = members.get(index);
        System.out.println("member = " + member);
    }

}
