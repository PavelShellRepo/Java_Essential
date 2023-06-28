package java_essential.task_by_category.inheritance_and_polymorphism.shape;

/*Создайте базовый класс Shape для представления геометрической фигуры.
Добавьте методы для вычисления площади и периметра фигуры.
Реализуйте классы Rectangle и Circle, которые наследуются от класса Shape и переопределите методы вычисления площади и периметра.
Создайте несколько объектов каждого класса и выведите результаты вычислений.*/

abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    static class Circle extends Shape {
        private static double radius;

        public Circle(double radius) {
            Circle.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }
}
