package java_essential.practice.append;

/* Напишите программу, которая принимает имя пользователя от пользователя
 и создает приветственное сообщение в формате "Привет, [имя пользователя]!".
 Используйте метод append() для конкатенации строк.*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        StringBuilder greetings = new StringBuilder("Hello, ");

        System.out.println(greetings.append(username).append("!"));
    }
}
