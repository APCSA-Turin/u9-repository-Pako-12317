import Computers.Desktop;

public class GamingDesktop extends Desktop {
    
    private String graphicsCard;

    public GamingDesktop(int ram, int storage, String graphicsCard) {
        super(ram, storage, true);
        this.graphicsCard = graphicsCard;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void updateGraphicsCardDrivers() {
        System.out.println("Graphics card drivers updated successfully!");
    }
}
