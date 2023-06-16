package java_start.homework4;

/* Cоздайте класс Translator.
Напишите программу русско-английский переводчик. Программа знает 10 слов о погоде. Требуется,
чтобы пользователь вводил слово на русском языке, а программа давала ему перевод этого слова на
английском языке. Если пользователь ввел слово, для которого отсутствует перевод, то следует вывести
сообщение, что такого слова нет.  */

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        System.out.println("Введите слово на русском языке: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input) {
            case "солнечный" -> System.out.println("sunny");
            case "дождь" -> System.out.println("rain");
            case "холод" -> System.out.println("cold");
            case "ветер" -> System.out.println("wind");
            case "жара" -> System.out.println("heat");
            case "туман" -> System.out.println("fog");
            case "снег" -> System.out.println("снег");
            case "прохладный" -> System.out.println("cool");
            case "ливень" -> System.out.println("shower");
            default -> System.out.println("Такого слова нет");
        }
    }
}
