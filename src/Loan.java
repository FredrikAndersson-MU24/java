public class Loan {
    private String title;

    public Loan(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "title='" + title + '\'' +
                '}';
    }
}
