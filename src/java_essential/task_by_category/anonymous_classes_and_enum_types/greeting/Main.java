package java_essential.task_by_category.anonymous_classes_and_enum_types.greeting;

/*Создайте интерфейс Greeting с методом sayHello().
Создайте анонимный класс, реализующий интерфейс Greeting и переопределяющий метод sayHello(), чтобы он выводил "Hello!" на экран.
Создайте объект анонимного класса и вызовите метод sayHello().*/

public class Main {
    public static void main(String[] args) {
        // Create an anonymous class object and call the sayHello() method
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }
        };
        greeting.sayHello();
    }
}
