package java_essential.task_by_category.exceptions.arithmeticException;

/*Напишите программу, которая делит одно число на другое.
Обработайте исключение ArithmeticException, которое возникает, когда происходит деление на ноль,
и выведите сообщение об ошибке, если это произошло.*/

import java.util.Scanner;

public class ArithmeticExceptionError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите делимое число: ");
        int dividend = scanner.nextInt();

        System.out.println("Введите делитель: ");
        int divisor = scanner.nextInt();

        try {
            int result = dividend / divisor;
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        }
    }
}
