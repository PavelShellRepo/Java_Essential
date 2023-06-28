package java_essential.task_by_category.static_and_nested_classes.outer;

/*Создайте класс Outer, содержащий вложенный класс Inner.
В классе Inner создайте метод, который выводит сообщение.
Создайте объект класса Outer и вызовите метод вложенного класса Inner, чтобы вывести сообщение.*/

public class Outer {
    public static class Inner {
        void displayMessage() {
            System.out.println("Message from Inner class.");
        }
    }
}
