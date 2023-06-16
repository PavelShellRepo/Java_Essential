package java_start.homework4;

/* Cоздайте класс Calculator.
Напишите программу – консольный калькулятор.
Создайте две переменные с именами operand1 и operand2. Задайте переменным некоторые
произвольные значения. Предложите пользователю ввести знак арифметической операции. Примите
значение, введенное пользователем и поместите его в строковую переменную sign.
Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
Выведите на экран результат выполнения арифметической операции.
В случае использования операции деления, организуйте проверку попытки деления на ноль. И если
таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
пользователя. */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите первое число: ");
        int operand1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int operand2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите знак арифметической операции: ");
        String sign = scanner.nextLine();

        switch (sign) {
            case "+" -> result = operand1 + operand2;
            case "-" -> result = operand1 - operand2;
            case "*" -> result = operand1 * operand2;
            case "/" -> {
                if (operand2 == 0) // Если operand2 примет значение 0, то выполнится это условие
                {
                    System.out.println("Делить на ноль запрещено");
                }
                result = operand1 / operand2;
            }
            default -> {
                System.out.println("Не известный знак");
                return; // return - прекращает выполнение метода
            }
        }

        System.out.println(operand1 + " " + sign + " " + operand2 + " = " + result);
    }
}