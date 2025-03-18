package Freestyle;

public class Movie extends AmazonProduct {
    private int duration;
    private String title;

    public Movie(String title, String genre, int duration, int inventory) {
        super(genre, inventory);
        this.title = title;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }
}
