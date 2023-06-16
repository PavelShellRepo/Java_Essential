package java_start.homework3;

/*Создайте класс Circle.
Создайте константу с именем PI (число π «пи»), создайте переменную радиус с именем – r. Используя
формулу πR2, вычислите площадь круга и выведите результат на экран. */

public class Circle {
    public static void main(String[] args) {
        final double PI =  3.141592653;
        double radius = 5.0;

        double area = PI * radius * radius;

        System.out.println("Circle radius: " + area);
    }
}
