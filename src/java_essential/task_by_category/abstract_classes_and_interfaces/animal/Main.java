package java_essential.task_by_category.abstract_classes_and_interfaces.animal;

/*Создайте абстрактный класс Animal с методом makeSound().
Создайте подклассы Cat и Dog, которые наследуются от класса Animal и реализуют метод makeSound().
Создайте массив типа Animal и поместите в него объекты классов Cat и Dog.
Вызовите метод makeSound() для каждого объекта и убедитесь, что правильный звук воспроизводится для каждого животного.*/

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Cat();
        animals[1] = new Dog();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
