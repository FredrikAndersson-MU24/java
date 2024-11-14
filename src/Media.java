public abstract class Media {
    private final String title;
    private final int published;
    private final boolean available;

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

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", published=" + published +
                ", available=" + available +
                '}';
    }
}
