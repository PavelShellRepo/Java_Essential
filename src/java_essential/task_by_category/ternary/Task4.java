package java_essential.task_by_category.ternary;

/*Напишите программу, которая принимает на вход три числа и находит наименьшее из них с использованием тернарного оператора.
Выведите результат.*/

public class Task4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int result = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println(result);
    }
}
