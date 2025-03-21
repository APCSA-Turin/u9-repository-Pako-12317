public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }
    
    public void pickupRiders(int numRiders, double farePerRider){
        setPassengers(getPassengers() + numRiders);
        fareCollected += numRiders * farePerRider;

        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() * 0.5);
            setDiscountApplied(true);
        }        
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        fareCollected += (getPassengers() * farePerRider)-(farePerRider);
        return dropOffPassengers(getPassengers()-1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fare Collected: " + getFareCollected());
    }

    @Override
    public void isTaxi() {
        System.out.println("This is a taxi.");
    }
}
