package java_essential.practice.length;

//Вам дан список имен пользователей. Напишите программу, которая выводит количество символов в каждом имени и находит самое длинное имя

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        String nameWithMaxLength = null;
        int max = 0;

        names.add("Bob");
        names.add("Pavel");
        names.add("Jack");
        names.add("Maria");
        names.add("Victor");

        for (String name : names) {
            System.out.println("Number of characters in the name " + name + " is: " + name.length());

            if (name.length() > max) {
                max = name.length();
                nameWithMaxLength = name;
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("The longest name is: " + nameWithMaxLength + ". Contains chars: " + max);
    }
}
