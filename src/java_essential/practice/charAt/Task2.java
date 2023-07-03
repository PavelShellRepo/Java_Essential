package java_essential.practice.charAt;

/* У вас есть список слов. Напишите программу, которая выводит первый символ каждого слова в списке. */

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Solar");
        words.add("Human");
        words.add("Energy");
        words.add("Liquid");
        words.add("Link");

        for (String word : words) {
            System.out.println(word.charAt(0));
        }
    }
}
