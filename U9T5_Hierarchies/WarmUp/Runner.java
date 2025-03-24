import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Animal animal = new Animal("Thing");
        Cow cow = new Cow("Marge");
        Dog dog = new Dog("Penny");
        Puppy puppy = new Puppy("Spot");

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(animal);
        animalList.add(cow);
        animalList.add(dog);
        animalList.add(puppy);

        for (Animal a : animalList) {
            if (a instanceof Cow) {
                ((Cow) a).milk();
            }
        }
    }
}
