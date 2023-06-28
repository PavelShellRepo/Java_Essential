package java_essential.task_by_category.lists;

/*Напишите программу, которая создает список целых чисел.
Добавьте несколько чисел в список, затем найдите сумму всех чисел, среднее значение и максимальное число в списке.*/

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(3);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.size();

        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Список чисел: " + numbers);
        System.out.println("Сумма всех чисел: " + sum);
        System.out.println("Среднее значение: " + average);
        System.out.println("Максимальное число: " + max);
    }
}
