package java_essential.testDir.genericTypeTest.test1;

public class Main {
    public static void main(String[] args) {
        GenericTypeTest1<String> string = new GenericTypeTest1<>();
        GenericTypeTest1<Integer> integer = new GenericTypeTest1<>();
        GenericTypeTest1<Double> doublee = new GenericTypeTest1<>();

        string.field = "String Generic";
        integer.field = 13;
        doublee.field = 13.13;

        string.Method();
        integer.Method();
        doublee.Method();
    }
}
