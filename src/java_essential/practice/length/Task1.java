package java_essential.practice.length;

// Напишите программу, которая принимает строку от пользователя и выводит количество символов в этой строке.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;

        System.out.println("Enter word: ");
        String input = scanner.nextLine();

        System.out.println("The length of your word is: " + input.length());

    }
}
