package java_essential.practice.substring;

// Напишите программу, которая принимает строку от пользователя и выводит подстроку, начиная с указанного индекса и заканчивая другим указанным индексом.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstIndex;
        int secondIndex;

        System.out.print("Enter string: ");
        String string = scanner.nextLine();
        System.out.print("Enter first index: ");
        firstIndex = scanner.nextInt();
        System.out.print("Enter first index: ");
        secondIndex = scanner.nextInt();

        String newString = string.substring(firstIndex, secondIndex);

        System.out.println("New string is: " + newString);
    }
}
