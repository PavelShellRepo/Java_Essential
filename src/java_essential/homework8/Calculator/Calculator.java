package java_essential.homework8.Calculator;

/*Создайте класс Calculator.
В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание,
mul – умножение, div – деление).
Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать
исключение.
Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию. При
возникновении ошибок должны выбрасываться исключения.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    double add(int a, int b) {
        return a + b;
    }

    double sub(int a, int b) {
        return a - b;
    }

    double mul(int a, int b) {
        return a * b;
    }

    double div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisible by zero is impossible.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter first number: ");
            double a = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double b = scanner.nextDouble();

            scanner.nextLine();

            System.out.println("Enter operator: + , - , / , *");
            char operator = scanner.nextLine().charAt(0);

            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                throw new InputMismatchException();
            }

            Calculator calculator = new Calculator();

            double result = switch (operator) {
                case '+' -> calculator.add((int) a, (int) b);
                case '-' -> calculator.sub((int) a, (int) b);
                case '*' -> calculator.mul((int) a, (int) b);
                case '/' -> calculator.div((int) a, (int) b);
                default -> 0;
            };
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number and operator.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
