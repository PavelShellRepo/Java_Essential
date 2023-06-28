package java_essential.task_by_category.static_and_nested_classes.outer;

public class Main {
    public static void main(String[] args) {
       Outer outer = new Outer();

       // Calling a method of a nested Inner class through an object of an Outer class
       Outer.Inner inner = new Outer.Inner();
       inner.displayMessage();
    }
}
