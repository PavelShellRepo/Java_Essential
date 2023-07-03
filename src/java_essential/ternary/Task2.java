package java_essential.ternary;

/*Напишите программу, которая сравнивает два числа и находит максимальное из них, используя тернарный оператор.
Выведите результат.*/

public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int result;

        result = a > b ? a : b;
        System.out.println(result);
    }
}
