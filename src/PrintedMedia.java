public abstract class PrintedMedia extends Media {
    private final int numPages;

    public PrintedMedia(String title, int published, int numPages) {
        super(title, published, true);
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public String toString() {
        return  "\nTitle: " + this.getTitle() +
                "\nPublished: " + this.getPublished() +
                "\nPage count: " + this.getNumPages() +
                "\nAvailable: " + (this.isAvailable() ? "Yes" : "No");
    }

}
