public class VehicleTester {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("ABC123", 2.50, 3);
        vehicle.isTaxi();
        Car car = new Car("XYZ789", 3.00, 4, true);
        car.isTaxi();
        Taxi taxi = new Taxi("TAXI001", 4.00, 2, false, 0.0);
        taxi.isTaxi();
        Truck truck = new Truck("TRUCK001", 5.00, 1, 6, true);
        truck.isTaxi();
    }
}
