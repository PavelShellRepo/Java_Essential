package java_essential.practice.substring;

//  У вас есть список слов. Напишите программу, которая выводит подстроку каждого слова, начиная с индекса 0 и заканчивая индексом 3.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Matilda");
        words.add("Pavel");
        words.add("Jackson");
        words.add("Maria");
        words.add("Victor");

        for (String word : words) {
            System.out.println(word.substring(0, 3));
        }
    }
}
