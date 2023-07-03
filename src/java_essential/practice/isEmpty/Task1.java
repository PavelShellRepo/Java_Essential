package java_essential.practice.isEmpty;

// Напишите программу, которая принимает строку от пользователя и проверяет, является ли она пустой (не содержит символов).

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type something: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("You have not entered anything");
        } else {
            System.out.println("You entered: " + input);
        }
    }
}
