import java.util.ArrayList;
import java.util.Scanner;

public class App {
    ArrayList<Book> books = new ArrayList<>();
    public void run(){
        Scanner scanner = new Scanner(System.in);
        initApp();
        while(true){
            int menuChoice = menu(scanner);
            System.out.println("menuChoice = " + menuChoice);
            if(menuChoice == 6){
                break;
            }
            menuSelect(menuChoice, scanner);
        }

        

    }

    public void initApp(){
        Book book1 = new Book("Gone girl","Jillian Flynn", 2004, "first");
        Book book2 = new Book("The Shining","Stephen King", 1978, "first");
        Book book3 = new Book("The Constant Gardener","John le Carre", 2000, "first");
        Book book4 = new Book("Hamlet","William Shakespear", 1610, "first");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

    }

    public int menu(Scanner scanner){
        System.out.println("\nWelcome to the Library!" +
                "\nWhat would you like to do today?" +
                "\n1 - Add a book to the library" +
                "\n2 - Search for a book by title" +
                "\n3 - List all available books" +
                "\n4 - Lend a book" +
                "\n5 - Return a book" +
                "\n6 - Quit" +
                "\nChoice: ");

        while(!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.println("Please enter a valid option from the menu!");
        }
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public void menuSelect(int menuChoice, Scanner scanner){
        switch(menuChoice){
            case 1:
                addBook(scanner);
                break;
            case 2:
                searchBook(scanner);
                break;
            case 3:
                listBooks();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("Please enter a valid option from the menu!");

                break;
        }
    }

    public void addBook(Scanner scanner){
        Book book = new Book();
        System.out.println("What's the title of the book?");
        String title = scanner.nextLine();
        book.setTitle(title);
        System.out.println("What's the author of the book?");
        String author = scanner.nextLine();
        book.setAuthor(author);
        System.out.println("What's the year of the book?");
        int year = scanner.nextInt();
        scanner.nextLine();
        book.setPublished(year);
        System.out.println("Which edition of the book is it?");
        String edition = scanner.nextLine();
        book.setEdition(edition);

        System.out.println("You have successfully added a new book to the library!");
        System.out.println(book);
        books.add(book);

    }

    public void listBooks(){
        books.forEach(System.out::println);
    }

    public void searchBook(Scanner scanner){
        System.out.println("\nWhat's the title of the book you are looking for?");
        String title = scanner.nextLine();
        boolean bookFound = false;
        Book bookFoundString = new Book();
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                bookFoundString = book;
                bookFound = true;
                break;
            }
        }
        if (bookFound){
            System.out.println("The book was found!");
            System.out.println("Do you want to lend it? Y/N");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("y")){
                bookFoundString.loan();
            } else if(answer.equalsIgnoreCase("n")){
                return;
            }else{
                System.out.println("Please enter a valid option from the menu!");

            }
        } else {
            System.out.println("The book was not found!");
        }
    }

}
