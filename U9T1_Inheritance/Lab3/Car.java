// public class Car extends Vehicle {
//     private boolean electric;
//     private boolean discountApplied;
    
//     public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
//       super(licensePlate, tollFee, passengers);
//       this.electric = electric;
//       discountApplied = false;   // default value
//     }
  
//     public boolean isElectric() {
//       return electric;
//     }
  
//     public boolean isDiscountApplied() {
//       return discountApplied;
//     }

//     public void printCar() {
//         System.out.println("License Plate: " + getLicensePlate());
//         System.out.println("Toll Fee: " + getTollFee());
//         System.out.println("Passengers: " + getPassengers());
//         System.out.println("Electric: " + isElectric());
//         System.out.println("Discount Applied: " + isDiscountApplied());
//     } 

//     public boolean dropOffPassengers(int numOut){
//         if (numOut < getPassengers()) {
//             setPassengers(getPassengers() - numOut);
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public void applyDiscount() {
//         if (!discountApplied && electric) {
//             setTollFee(getTollFee() * 0.5);
//             discountApplied = true;
//         }
//     }

//     public void setDiscountApplied(boolean discountApplied) {
//         this.discountApplied = discountApplied;
//     }
// }