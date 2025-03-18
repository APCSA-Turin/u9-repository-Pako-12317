package Animals;
public class Cat extends Animal {
    private int timesStuckInTree;

    public Cat(String name, int age, int timesStuckInTree) {
        super(name, age);
        this.timesStuckInTree = timesStuckInTree;
    }

    public int getTimesStuckInTree() {
        return timesStuckInTree;
    }

    public void meow() {
        System.out.println("Meow! Meow!");
    }

    public void climbTree() {
        System.out.println("Climbing the tree!");
        if(Math.random() < 0.1) {
            System.out.println("Cat is stuck in the tree!");
            timesStuckInTree++;
        }
    }
}
