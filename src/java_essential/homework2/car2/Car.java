package java_essential.homework2.car2;

/* Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
Перегрузить конструкторы.
Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.
*/

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car() {}

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(2001);
        Car c3 = new Car(2001, 200);
        Car c4 = new Car(2001, 200, 2400);
        Car c5 = new Car(2001, 200, 2400, "Black");
    }
}
