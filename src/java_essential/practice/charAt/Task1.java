package java_essential.practice.charAt;

/*Напишите программу, которая принимает строку от пользователя и выводит первый символ этой строки.*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String input = scanner.nextLine();

        System.out.println("The first symbol of your string is: " + input.charAt(0));
    }
}
