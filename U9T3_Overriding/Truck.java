public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }
    
    public boolean validateLicensePlate() {
        if (!hasTrailer) {
            return true;
        } else {
            if (axles > 4) {
                return getLicensePlate().endsWith("MX");
            } else {
                return getLicensePlate().endsWith("LX");
            }
        }
    }

    @Override
    public double calculateTollPrice() {
        double tollPrice = getTollFee() * getAxles();
        if (hasTrailer) {
            tollPrice *= 2; // Additional fee for having a trailer
        }
        return tollPrice;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Axles: " + getAxles());
        System.out.println("Has Trailer: " + hasTrailer());
    }
}