public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    
   public Vehicle(String licensePlate, double tollFee, int passengers) {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
   }
  
   public String getLicensePlate() {
    return licensePlate;
   }
  
   public double getTollFee() {
    return tollFee;
   }

   public void setTollFee(double tollFee) {
       this.tollFee = tollFee;
   }
  
   public int getPassengers() {
    return passengers;
   }
  
   public double calculateTollPrice() {
    return tollFee * passengers;
   }

   public void setPassengers(int passengers) {
    this.passengers = passengers;
   }

   public void printInfo() {
       System.out.println("License Plate: " + getLicensePlate());
       System.out.println("Toll Fee: " + getTollFee());
       System.out.println("Passengers: " + getPassengers());
   }

   public void isTaxi() {
       System.out.println("This is not a taxi.");
   }
}