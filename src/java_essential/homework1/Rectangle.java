package java_essential.homework1;

import java.util.Scanner;

public class Rectangle {
    private double side1;
    private double side2;

    public double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    public double perimeterCalculator(double side1, double side2) {
        return 2 * (side1 + side2);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side A: ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter side B: ");
        double side2 = scanner.nextDouble();

        double area = rectangle.areaCalculator(side1, side2);
        double perimeter = rectangle.perimeterCalculator(side1, side2);

        System.out.println("-----------------------------");

        System.out.println("Rectangle area : " + area);
        System.out.println("Rectangle perimeter : " + perimeter);

        System.out.println("-----------------------------");
    }
}
