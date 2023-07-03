package java_essential.practice.split;

// Напишите программу, которая принимает строку от пользователя,
// разделяет ее на слова, используя пробел в качестве разделителя, и выводит каждое слово на отдельной строке.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        String[] inputDividedByWhitespace = input.split(" ");

        for (String s : inputDividedByWhitespace) {
            System.out.println(s);
        }
    }
}