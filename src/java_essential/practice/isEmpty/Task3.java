package java_essential.practice.isEmpty;

// Вам дан список имен пользователей. Напишите программу, которая проверяет, есть ли пустые имена в списке, и выводит их количество.

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        int emptyStrings = 0;

        names.add("Bob");
        names.add("Pavel");
        names.add("Jack");
        names.add("");
        names.add("Maria");
        names.add("Victor");

        for (String name : names) {
            if (name.isEmpty()) {
                emptyStrings +=1;
            }
        }
        System.out.println("Number of empty lines in the list: " + emptyStrings);
    }
}
