package java_essential.practice.isEmpty;

// У вас есть список строк. Напишите программу, которая проверяет, есть ли пустые строки в списке, и выводит их количество.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        int emptyStringsCount = 0;

        strings.add("String1");
        strings.add("String2");
        strings.add("String3");
        strings.add("String4");
        strings.add("");
        strings.add("");

        for (String string : strings) {
            if (string.isEmpty()) {
                emptyStringsCount+=1;
            }
        }
        System.out.println("Empty lines in the list: " + emptyStringsCount);
    }
}
