package java_essential.practice.append;

/*У вас есть список слов.
Напишите программу, которая создает предложение, состоящее из этих слов, разделенных пробелами.
Используйте метод append() для конкатенации строк*/

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main (String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Hello,");
        strings.add("how");
        strings.add("are");
        strings.add("you?");

        StringBuilder newString = new StringBuilder();

        for (String string : strings) {
            newString.append(string).append(" ");
        }

        String finalString = newString.toString().trim();
        System.out.println("Created sentence: " + finalString);
    }
}
