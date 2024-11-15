public class RecordedMedia extends Media {
    private int length;
    public RecordedMedia(String title, int published, int length, boolean available) {
        super(title, published, available);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        return  "\nTitle: " + this.getTitle() +
                "\nPublished: " + this.getPublished() +
                "\nLength: " + this.getLength() +
                "\nAvailable: " + (this.isAvailable() ? "Yes" : "No");
    }
}
