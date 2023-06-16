package java_essential.homework2.car1;

/*
Создать класс Машина с полями год(int), цвет(String).
Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
*/

public class Car {
    int year;
    String color;

    public Car() {}

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.year = 2007;
        car1.color = "Black";

        Car car2 = new Car(2003, "Red");

        System.out.println(car1.year + " " + car1.color);
        System.out.println(car2.year + " " + car2.color);
    }
}
