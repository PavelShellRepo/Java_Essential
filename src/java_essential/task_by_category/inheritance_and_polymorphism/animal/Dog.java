package java_essential.task_by_category.inheritance_and_polymorphism.animal;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("I can say gav-gav...");
    }

    @Override
    public void move() {
        System.out.println("I can run");
    }
}
