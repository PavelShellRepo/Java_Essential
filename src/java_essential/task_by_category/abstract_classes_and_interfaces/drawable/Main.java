package java_essential.task_by_category.abstract_classes_and_interfaces.drawable;

/*Создайте интерфейс Drawable с методом draw().
Реализуйте этот интерфейс в классах Circle, Rectangle и Triangle, которые представляют геометрические фигуры.
Создайте массив типа Drawable и поместите в него объекты каждого класса.
Вызовите метод draw() для каждого объекта и убедитесь, что каждая фигура отрисовывается правильно.*/

public class Main {
    public static void main(String[] args) {
        Drawable[] drawables = new Drawable[3];

        drawables[0] = new Circle();
        drawables[1] = new Rectangle();
        drawables[2] = new Triangle();

        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
