package java_essential.homework2;

/*
Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle, который
должен принимать радиус и используя PI посчитать площадь круга.
Создать класс Main, где запустить данный метод
*/

public class MyArea {
    final static double PI = 3.14;

    public static double areaOfCircle(double radius) {
        return (radius * 2) * PI;
    }

    public static void main(String[] args) {
        double area = areaOfCircle(24.3);
        System.out.println(area);
    }
}


