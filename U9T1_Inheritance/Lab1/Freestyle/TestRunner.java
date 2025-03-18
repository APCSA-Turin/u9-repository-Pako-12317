package Freestyle;

public class TestRunner {
    public static void main(String[] args) {
        // Test AmazonProduct
        AmazonProduct product = new AmazonProduct("Electronics", 100);
        System.out.println("AmazonProduct Genre: " + product.getGenre());
        System.out.println("AmazonProduct Inventory: " + product.getInventory());

        // Test Movie
        Movie movie = new Movie("Inception", "Sci-Fi", 148, 50);
        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Movie Genre: " + movie.getGenre());
        System.out.println("Movie Duration: " + movie.getDuration());
        System.out.println("Movie Inventory: " + movie.getInventory());

        // Test VideoGame
        VideoGame game = new VideoGame("The Last of Us", "Action", 100, 30);
        System.out.println("VideoGame Title: " + game.getName());
        System.out.println("VideoGame Genre: " + game.getGenre());
        System.out.println("VideoGame Platform: " + game.getLevels());
        System.out.println("VideoGame Inventory: " + game.getInventory());
    }
}
