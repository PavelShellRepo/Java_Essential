package java_essential.homework2.car3;

/* Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
Перегрузить конструкторы вызывая конструктор из конструктора.
Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.
*/

public class Car {
    int year;
    double speed;
    int height;
    String color;

    public Car() {}


    public Car(int year) {
        this(year, 200, 1450, "Red");
    }

    public Car(int year, double speed) {
        this(year, speed, 1750, "White");
    }

    public Car(int year, double speed, int height) {
        this(year, speed, height, "Yellow");
    }

    public Car(int year, double speed, int height, String color) {
        this.year = year;
        this.speed = speed;
        this.height = height;
        this.color = color;
    }

    public void carShow() {
        System.out.println("------------------------------");
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.carShow();
        Car car2 = new Car(2002);
        car2.carShow();
        Car car3 = new Car(2003, 203);
        car3.carShow();
        Car car4 = new Car(2004, 204, 1444);
        car4.carShow();
        Car car5 = new Car(2005, 205, 1555, "Black");
        car5.carShow();

    }
}
