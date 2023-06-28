package java_essential.task_by_category.inheritance_and_polymorphism.animal;

public class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("I can say chick-chirik");
    }

    @Override
    public void move() {
        System.out.println("I can fly...");
    }
}
