package java_essential.homework6;

public class Container {
    void print() {
        System.out.println("Print from main container class");
    }

    static class Class1 {
        void print() {
            System.out.println("Print from class1");
        }
    }

    static class Class2 {
        void print() {
            System.out.println("Print form class2");
        }
    }

    static class Class3 extends Class2 {
        @Override
        void print() {
            System.out.println("Override print method from class2");
        }
    }

    public static void main(String[] args) {
        Container container = new Container();
        container.print();

        Class1 class1 = new Class1();
        class1.print();

        Class2 class2 = new Class2();
        class2.print();

        Class3 class3 = new Class3();
        class3.print();
    }
}
