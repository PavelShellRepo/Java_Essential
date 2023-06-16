package java_essential.homework3.Vehicles;

public class Ship extends Vehicle {
    private final int passengerCount;
    private final String port;

    public Ship(String name, String type, double latitude, double longitude, double price, double speed, int year, int passengerCount, String port) {
        super(name, type, latitude, longitude, price, speed, year);
        this.passengerCount = passengerCount;
        this.port = port;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Passenger Count: " + passengerCount);
        System.out.println("Port: " + port);
    }

}
