package java_essential.homework5;

/* Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index,
element).
Вывести список в консоль. */

import java.util.ArrayList;
import java.util.List;

public class Zoo {
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

        System.out.println(animals);
    }
}
