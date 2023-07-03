package java_essential.ternary;

/*Напишите программу, которая использует тернарный оператор для определения, является ли заданное число четным или нечетным.
Выведите соответствующее сообщение.*/

public class Task1 {
    public static void main(String[] args) {
        System.out.println(checkNum(99));
    }

    public static String checkNum(int a) {
        return a % 2 == 0 ? "Чётное" : "Не чётное";
    }
}
