import java.time.LocalDate;
import java.time.Period;

public class Loan {
    private String title;
    private Media item;
    private LocalDate startDate;
    private LocalDate endDate;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public Media getItem() {
        return item;
    }

    public void setItem(Media item) {
        this.item = item;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
