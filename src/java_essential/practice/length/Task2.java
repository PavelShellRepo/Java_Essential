package java_essential.practice.length;

// Вам дан список слов.
// Напишите программу, которая выводит количество символов в каждом слове и формирует новый список, содержащий количество символов для каждого слова.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        List<Integer> listCounts = new ArrayList<>();

        words.add("Bob");
        words.add("Pavel");
        words.add("Jack");
        words.add("Maria");
        words.add("Victor");

        for (String word : words) {
            System.out.println("Words in word " + word + " is: " + word.length());
            int wordCount = word.length();
            listCounts.add(wordCount);
        }

        System.out.println("----------------------------------------");
        System.out.println("List containing the number of characters: " + listCounts);
    }
}
