package java_essential.task_by_category.inheritance_and_polymorphism.shape;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(55, 42);
        Rectangle.Circle circle = new Rectangle.Circle(5.2);

        System.out.println("Rectangle: ");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println(" ");
        System.out.println("Circle: ");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}