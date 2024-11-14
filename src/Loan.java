public class Loan {
    private String title;
    private Media item;

    public Loan(String title, Media item) {
        this.title = title;
        this.item = item;
    }

    @Override
    public String toString() {
        return  "Title: " + "" + title +
                "\nItem: " + item;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Media getItem() {
        return item;
    }

    public void setItem(Media item) {
        this.item = item;
    }
}
