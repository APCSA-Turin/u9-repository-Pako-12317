package Animals;
public class Dog extends Animal{
    private String breed;
    
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public void bark(){
        System.out.println("Woof! Woof!");
    }
    
    public void fetch(){
        System.out.println("Fetching the ball!");
    }
}
