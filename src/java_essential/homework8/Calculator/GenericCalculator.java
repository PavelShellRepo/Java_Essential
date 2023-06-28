package java_essential.homework8.Calculator;

public class GenericCalculator {
    public static <T extends Number> double performArithmeticOperation(T a, T b, char operator) {
        double result = 0.0;

        switch (operator) {
            case '+' -> result = a.doubleValue() + b.doubleValue();
            case '-' -> result = a.doubleValue() - b.doubleValue();
            case '*' -> result = a.doubleValue() * b.doubleValue();
            case '/' -> result = a.doubleValue() / b.doubleValue();
            default -> System.out.println("Unsupported operation.");
        }

        return result;
    }

    public static void main(String[] args) {
        double a = 18.4;
        int b = 5;
        char operator = '+';

        double result = performArithmeticOperation(a, b, operator);
        System.out.println("Результат: " + result);
    }
}
