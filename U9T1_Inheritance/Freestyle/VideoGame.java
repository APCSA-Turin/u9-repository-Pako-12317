package Freestyle;

public class VideoGame extends AmazonProduct{
    private String name;
    private int levels;

    public VideoGame(String name, String genre, int levels, int inventory){
        super(genre, inventory);
        this.name = name;
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public String getName() {
        return name;
    }
}
