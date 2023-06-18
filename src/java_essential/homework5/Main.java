package java_essential.homework5;

/* Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со
школы. И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль. */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teachers = new ArrayList<>();
        teachers.add("Anna B.");
        teachers.add("Barbara I.");
        teachers.add("Jenny M.");
        teachers.add("Alisa J.");
        teachers.add("Maria S.");

        System.out.println("Index:" + teachers.indexOf("Maria S."));
        System.out.println("Index:" + teachers.indexOf("Jenny M."));

        System.out.println(teachers);
    }
}
