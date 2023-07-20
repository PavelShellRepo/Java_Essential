package java_essential.testDir.genericTypeTest.test2;

public class Main {
    public static void main(String[] args) {
        GenericTypeTest2<Integer, Integer> instance1 = new GenericTypeTest2<>(1, 2);
        System.out.println(instance1.variable1 + instance1.variable2);

        GenericTypeTest2<String, Integer> instance2 = new GenericTypeTest2<>("Number ", 1);
        System.out.println(instance2.variable1 + instance2.variable2);

        GenericTypeTest2<String, String> instance3 = new GenericTypeTest2<>("Hello ", "World");
        System.out.println(instance3.variable1 + instance3.variable2);
    }
}
