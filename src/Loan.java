import java.time.LocalDate;

public class Loan {
    private final String title;
    private final Media item;
    private final LocalDate startDate;
    private final LocalDate endDate;

    public Loan(String title, Media item, int lendPeriod) {
        this.title = title;
        this.item = item;
        this.startDate = LocalDate.now();
        this.endDate = startDate.plusWeeks(lendPeriod);
    }

    @Override
    public String toString() {
        return  "Title: " + title +
                "\nStart date: " + startDate +
                "\nEnd date: " + endDate;
    }

    public String getTitle() {
        return title;
    }

    public Media getItem() {
        return item;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
