public class Magazine extends PrintedMedia {
    private String publisher;


    public Magazine(String title, int published, String publisher, int numPages) {
        super(title, published, numPages);
        this.publisher = publisher;
    }
}
