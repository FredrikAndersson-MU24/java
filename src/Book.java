public class Book {
    private String title;
    private String author;
    private int published;
    private String edition;
    private boolean available;


    public Book(String title, String author, int published, String edition) {
        this.title = title;
        this.author = author;
        this.published = published;
        this.edition = edition;
        this.available = true;
    }

    public Book() {
        this.title = "no name defined";
        this.author = "no author defined";
        this.published = 0000;
        this.edition = "no edition defined";
        this.available = true;
    }

    public void loan(){
        if(this.available){
            this.available = false;
            System.out.println("You have succesfully loaned " + this.title + ". Please return it on time.");
        }else {
            System.out.println("This book is not available");
        }
    }

    public void returnBook(){
        if(!this.available){
            System.out.println("Thank you for returning the book!");
            this.available = true;
        } else {
            System.out.println("Sorry, that book is already available. Did you enter the correct information?");
        }
    }

    public String toString(){
        return  "\nTitle: " + this.title +
                "\nAuthor: " + this.author +
                "\nPublished: " + this.published +
                "\nEdition: " + edition +
                "\nAvailable: " + this.available;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}
