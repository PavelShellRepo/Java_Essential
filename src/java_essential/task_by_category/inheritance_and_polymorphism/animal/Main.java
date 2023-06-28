package java_essential.task_by_category.inheritance_and_polymorphism.animal;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Bird: ");
        bird.makeSound();
        bird.move();
        System.out.println("----------------");
        System.out.println("Cat: ");
        cat.makeSound();
        cat.move();
        System.out.println("----------------");
        System.out.println("Dog: ");
        dog.makeSound();
        dog.move();
        System.out.println("----------------");
    }
}
