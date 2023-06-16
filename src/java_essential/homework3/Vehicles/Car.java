package java_essential.homework3.Vehicles;

public class Car extends Vehicle {
    private final int seatCount;

    public Car(String name, String type, double price, double speed, int year, int seatCount) {
        super(name, type, price, speed, year);
        this.seatCount = seatCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Count: " + seatCount);
    }
}
