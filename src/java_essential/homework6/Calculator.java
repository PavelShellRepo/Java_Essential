package java_essential.homework6;

/* Создать класс Calculator, с методами для выполнения основных арифметических операций.
Написать программу, которая выводит на экран основные арифметические операции. */

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Calculator calculator = new Calculator();

            int a = 10;
            int b = 5;

            System.out.println("a + b = " + calculator.add(a, b));
            System.out.println("a - b = " + calculator.subtract(a, b));
            System.out.println("a * b = " + calculator.multiply(a, b));

            try {
                System.out.println("a / b = " + calculator.divide(a, b));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
