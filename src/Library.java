import medias.*;
import members.*;
import utilities.InputHandler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library{
    private final List<Media> medias = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();
    public static boolean mainMenu = true;
    public static Member currentVisitor;

    public Library(){
        initMediaList();
        createMembersList();
        while(mainMenu){

            run();

        }
    }



    public void run(){
        printMainMenu();
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


    public void printMainMenu(){
        System.out.println("What do you want to do?");
        System.out.println("1. Member login");
        System.out.println("2. Admin login");
        System.out.println("0. Quit");
        int choice = InputHandler.getIntInRange(0,2);
        switch(choice){
            case 1:
                printMemberMenu();
                break;
            case 2:
                printAdminMenu();
                break;
            case 0:
                System.out.println("Thank you for visiting the library");
                mainMenu = false;
                break;

        }
    }


    public void printAdminMenu(){
        boolean adminMenu = true;
        while(adminMenu){

            System.out.println("What do you want to do?");
            System.out.println("1. List all books");
            System.out.println("2. List all magazines");
            System.out.println("3. List all films");
            System.out.println("4. Add media to the library");
            System.out.println("5. Check active loans");
            System.out.println("6. Lend an item");
            System.out.println("7. Return item");
            System.out.println("8. Check late returns");
            System.out.println("9. View all members");
            System.out.println("10. Add a new member");
            System.out.println("0. Exit to main menu");
            int choice = InputHandler.getIntInRange(0,10);
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
                    addNewMediaMenu();
                    break;
                case 5:
                    checkLoans();
                    break;
                case 6:
                    lendItem();
                    break;
                case 7:
                    returnItem();
                    break;
                case 8:
                    checkIfLate();
                    break;
                case 9:
                    viewAllMembers();
                    break;
                case 10:
                    addNewMemberAsAdmin();
                    break;
                case 0:
                    System.out.println("Exiting to main menu");
                    adminMenu = false;
                    break;

            }

        }

    }


    public void printMemberMenu(){
        boolean memberMenu = true;

        login();
        while(memberMenu){

            System.out.println("What do you want to do?");
            System.out.println("1. List all books");
            System.out.println("2. List all magazines");
            System.out.println("3. List all films");
            System.out.println("4. Check my active loans");
            System.out.println("5. Lend an item");
            System.out.println("6. Return item");
            System.out.println("7. Check if I have late returns");
            System.out.println("8. View my membership details");
            System.out.println("0. Exit to main menu");
            int choice = InputHandler.getIntInRange(0,8);
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
                    lendItem();
                    break;
                case 6:
                    returnItem();
                    break;
                case 7:
                    checkIfLate();
                    break;
                case 8:
                    viewMembership();
                    break;
                case 0:
                    System.out.println("Exiting to main menu");
                    memberMenu = false;
                    break;

            }

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
        }

    public void viewMembership(){
        System.out.println(currentVisitor.toString());
    }

    public void checkLoans(){
        if(currentVisitor.getLoans().isEmpty()){
            System.out.println("\nYou currently have no active loans\n");
        } else {
            System.out.println("\nYou have " + currentVisitor.getLoans().size() + " active loans.");
            for(Loan l : currentVisitor.getLoans()){
                if(l.getItem() instanceof Book){
                    System.out.println("\nmedias.Book: ");
                    System.out.println(l);
                }
                if(l.getItem() instanceof Magazine){
                    System.out.println("\nmedias.Magazine: ");
                    System.out.println(l);
                }
                if(l.getItem() instanceof Film){
                    System.out.println("\nmedias.Film: ");
                    System.out.println(l);
                }
            }
        }
    }

    public void lendItem(){
        boolean runLend = true;
        while(runLend) {
            System.out.println("Please enter the name of the item you wish to lend: ");
            String input = InputHandler.getString();
            int index = -1;
            boolean found = false;
            for (Media m : medias) {
                if (m.getTitle().equals(input)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                for (Media n : medias) {
                    if (n.getTitle().equals(input)) {
                        if (!n.isAvailable()) {
                            System.out.println("\nSorry, this book is currently not available.\n");
                            break;
                        } else {
                            index = medias.indexOf(n);
                        }
                    }
                }
                if (index > -1) {
                    System.out.println("index = " + index);
                    currentVisitor.getLoans().add(new Loan(input, medias.get(index), currentVisitor.getLendPeriod()));
                    medias.get(index).setNotAvailable();
                    runLend = false; // TODO Add possibility to lend more items
                }
            } else {
                System.out.println("\nCan not find that item");
                System.out.println("Do you want to enter again? Y/N");
                runLend = InputHandler.getBoolean();
            }
        }
    }

    public void returnItem(){
        boolean running = true;
        while(running){
            System.out.println("Please enter the name of the item you wish to return: ");
            String input = InputHandler.getString();
            int index = 0;
            for (Media m : medias) {
                if(m.getTitle().equals(input)){
                    index = medias.indexOf(m);
                }
            }
            if(currentVisitor.hasItem(input)){
                Loan loan = currentVisitor.getLoan(input);
                currentVisitor.getLoans().remove(loan);
                medias.get(index).setAvailable();
                running = false;
            } else {
                System.out.println("\nCan not find that item");
                System.out.println("Do you want to enter again? Y/N");
                running = InputHandler.getBoolean();
            }
        }
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
            }
        }
        if(isMember){
            System.out.println("Welcome back, " + input +"!");
            setCurrentVisitor(input);
        } else {
            System.out.println("You are not a member yet. \n Do you want to sign up?");
            boolean signup = InputHandler.getBoolean();
            if(signup){
                addNewMemberAsMember();
            } else {
                System.out.println("Good bye!");
            }
        }
    }

    public void setCurrentVisitor(String member){
        int index = 0;
        for (Member mem : members) {
            if(mem.getName().equals(member)){
                index = members.indexOf(mem);
            }
        }
        currentVisitor = members.get(index);
    }

    public void checkIfLate(){
        boolean late = false;
        for(Loan loan : currentVisitor.getLoans()){
            if(!loan.isLate()){
                System.out.println("LATE");
                System.out.println("\"" + loan.getTitle() + "\"" + " is late! Last return date " + loan.getEndDate());
                late = true;
            }
        }
        if(!late){
            System.out.println("You have no late returns.");
        }
    }

    public void addNewMemberAsAdmin(){
        String name = addNewMember("Please enter the name of the new member: ",
                "Should this be a VIP membership? Y/N");
        System.out.println("Thanks for adding " + name + "!");
    }

    public void addNewMemberAsMember(){
        String name = addNewMember("Please enter your name: ", "Do you want to sign up for the VIP membership? Y/N ");
        setCurrentVisitor(name);
        System.out.println("Thanks for signing up " + name + "!");
    }




    public String addNewMember(String enterName, String chooseVIP){
        System.out.println(enterName);
        String name = InputHandler.getString();
        System.out.println(chooseVIP);
        boolean vip = InputHandler.getBoolean();
        if (vip) {
            members.add(new MemberVIP(name));
        } else {
            members.add(new MemberReg(name));
        }
        return name;
    }

    public void addNewMediaMenu(){
        boolean addNewMediaMenu = true;
        while(addNewMediaMenu){
            System.out.println("What type of media do you want to add?");
            System.out.println("1. Book");
            System.out.println("2. Film");
            System.out.println("3. Magazine");
            System.out.println("0. Back");
            int type = InputHandler.getIntInRange(0,3);
            switch(type){
                case 1:
                    addNewBook();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    addNewMediaMenu = false;
                    break;
            }
        }

    }

    public void addNewBook(){
        System.out.println("Enter title: ");
        String title = InputHandler.getString();
        System.out.println("Enter year of publication(YYYY): ");
        int published = InputHandler.getFourDigitInt();
        System.out.println("Enter the number of pages: ");
        int pages = InputHandler.getInt();
        medias.add(new Book(title, published, pages));
        System.out.println("Thanks for adding a new book!");
    }


    public void viewAllMembers(){
        members.forEach(m -> System.out.println(m.toStringAdmin()));
    }
}
