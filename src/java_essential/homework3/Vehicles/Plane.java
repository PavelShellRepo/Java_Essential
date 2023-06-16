package java_essential.homework3.Vehicles;

public class Plane extends Vehicle {
    private final double height;
    private final int passengerCount;

    public Plane(String name, String type, double latitude, double longitude, double price, double speed, int year, double height, int passengerCount) {
        super(name, type, latitude, longitude, price, speed, year);
        this.height = height;
        this.passengerCount = passengerCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Height: " + height);
        System.out.println("PassengerCount: " + passengerCount);
    }
}
