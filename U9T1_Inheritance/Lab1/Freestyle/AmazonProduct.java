package Freestyle;

public class AmazonProduct {
    private String genre;
    private int inventory;
     public AmazonProduct(String genre, int inventory){
        this.genre = genre;
        this.inventory = inventory;
     }

     public String getGenre(){
        return genre;
     }

     public int getInventory() {
         return inventory;
     }
}
