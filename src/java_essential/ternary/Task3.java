package java_essential.ternary;

/*Напишите программу, которая принимает на вход три числа и определяет,
является ли хотя бы одно из них отрицательным, используя тернарный оператор. Выведите соответствующее сообщение.*/

public class Task3 {
    public static void main(String[] args) {
        System.out.println(checkNegative(22, 32, 1));
    }

    public static String checkNegative(int a, int b, int c) {
        return a < 0 || b < 0 || c < 0 ? "Хотя бы одно число отрицательное" : "Все числа положительные или равны нулю";
    }
}
