package java_essential.practice.split;

/* Вам дан список строк, содержащих имена и фамилии пользователей, разделенных запятой.
Напишите программу, которая разделяет каждую строку на имя и фамилию, используя запятую в качестве разделителя, и выводит имена и фамилии на отдельных строках.*/

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bob,Smith");
        names.add("Pavel,Johnson");
        names.add("Jack,Williams");
        names.add("Maria,Brown");
        names.add("Victor,Harris");

        for (String name : names) {
            String[] formattedName = name.split(",");
            if (formattedName.length == 2) {
                String firstName = formattedName[0].trim();
                String lastName = formattedName[1].trim();
                System.out.println("Name: " + firstName);
                System.out.println("Last name: " + lastName);
                System.out.println("-----------");
            }
        }
    }
}
