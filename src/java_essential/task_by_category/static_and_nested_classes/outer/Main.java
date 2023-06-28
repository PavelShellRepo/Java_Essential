package java_essential.task_by_category.static_and_nested_classes.outer;

/*Создайте класс Outer, содержащий вложенный класс Inner.
В классе Inner создайте метод, который выводит сообщение.
Создайте объект класса Outer и вызовите метод вложенного класса Inner, чтобы вывести сообщение.*/

public class Main {
    public static void main(String[] args) {
       Outer outer = new Outer();

       // Calling a method of a nested Inner class through an object of an Outer class
       Outer.Inner inner = new Outer.Inner();
       inner.displayMessage();
    }
}
