package java_essential.practice.charAt;

// Вам дан список имен пользователей. Напишите программу, которая выводит первый символ каждого имени и формирует новую строку из этих символов.

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bob");
        names.add("Pavel");
        names.add("Jack");
        names.add("Maria");
        names.add("Victor");

        StringBuilder newString = new StringBuilder();

        for (String name : names) {
            System.out.println(name.charAt(0));
            newString.append(name.charAt(0));
        }

        System.out.println(newString);
    }
}
