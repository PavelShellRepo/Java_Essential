package java_essential.homework7.Shape;

/*Задача: Анонимный класс для абстрактного класса Shape.
Создайте абстрактный класс Shape с абстрактным методом getArea().
Используя анонимный класс, создайте экземпляр Shape для круга и реализуйте метод getArea(), чтобы он возвращал площадь круга.
Затем выведите значение площади на экран.*/

abstract class Shape {
    public abstract double getArea();
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Shape() {
            @Override
            public double getArea() {
                double radius = 5.0;
                return Math.PI * radius * radius;
            }
        };
        double area = circle.getArea();
        System.out.println("Area of the circle: " + area);
    }
}
