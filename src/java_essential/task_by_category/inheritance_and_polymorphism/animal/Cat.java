package java_essential.task_by_category.inheritance_and_polymorphism.animal;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("I can say meow...");
    }

    @Override
    public void move() {
        System.out.println("I can run.");
    }
}
