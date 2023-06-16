package java_essential.homework3.Vehicles;

/*Создать класс Vehicle.
В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
выпуска).
Создайте 3 производных класса Plane, Саг и Ship.
Для класса Plane должна быть определена высота и количество пассажиров.
Для класса Ship – количество пассажиров и порт приписки.
Написать программу, которая выводит на экран информацию о каждом средстве передвижения. */

public class Main {
    public static void main(String[] args) {
        Car reno = new Car("Reno", "Car", 4500.65d, 180, 2003, 4);
        reno.displayInfo();
        Ship ship = new Ship("Space Heavy", "Ship", 37.7749, -122.4194, 750000, 3500, 2023, 800, "San Francisco");
        ship.displayInfo();
        Plane plane = new Plane("Fly JEt 2000", "Planner", 3542.285, 84.6898, 80000, 1500, 2007, 10000, 350);
        plane.displayInfo();
    }
}
