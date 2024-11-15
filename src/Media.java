public abstract class Media {
    private final String title;
    private final int published;
    private boolean available;

    public Media(String title, int published, boolean available) {
        this.title = title;
        this.published = published;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public int getPublished() {
        return published;
    }

    public void setAvailable() {
        this.available = true;
    }

    public void setNotAvailable() {
        this.available = false;
    }


    public boolean isAvailable() {
        return available;
    }

    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", published=" + published +
                ", available=" + available +
                '}';
    }

}
