import java.util.ArrayList;

public class Vet {
    private String vetName;
    private ArrayList<Animal> clients;

    public Vet(String name) {
        vetName = name;
        clients = new ArrayList<Animal>();
    }

    public boolean addClient(Animal a) {
        for (Animal animal : clients) {
            if (animal.equals(a)) {
                System.out.println("Animal " + a.getName() + " is already a client of " + vetName + ".");
                return false;
            }
        }
        clients.add(a);
        System.out.println("Welcome to " + vetName + "'s office, " + a.getName() + ".");
        return true;
    }

    public void printClientList() {
        for (Animal animal : clients) {
            System.out.println(animal.getName() + ": " + animal.getClass());
        }
    }
}
