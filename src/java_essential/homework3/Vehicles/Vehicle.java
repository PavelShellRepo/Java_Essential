package java_essential.homework3.Vehicles;

public class Vehicle {
    private final String name;
    private final String type;
    private double latitude;  // широта
    private double longitude; // долгота
    private final double price;
    private final double speed;
    private final int year;

    public Vehicle(String name, String type, double latitude, double longitude, double price, double speed, int year) {
        this.name = name;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public Vehicle(String name, String type, double price, double speed, int year) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("------------------------");
        System.out.println("Vehicle Information:");
        System.out.println(" ");
        System.out.println("Vehicle Name: " + name);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
        System.out.println("Year: " + year);
    }
}
