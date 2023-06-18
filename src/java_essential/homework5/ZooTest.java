package java_essential.homework5;

/* Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль. */

import java.util.ArrayList;
import java.util.List;

public class ZooTest {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add(0, "Zebra");
        animals.add(1, "Tiger");
        animals.add(2, "Elephant");
        animals.add(3, "Bird");
        animals.add(4, "Fish");
        animals.add(5, "Dog");
        animals.add(6, "Cat");
        animals.add(7, "Snake");

        animals.remove(7);
        animals.remove(3);
        animals.remove(5);


        System.out.println("List size: " + animals.size());

        System.out.println(animals);
    }
}
