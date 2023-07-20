package java_essential.homework9;

/*Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования его
экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс взаимодействия с
экземпляром, должен включать метод добавления элемента, индексатор для получения значения
элемента по указанному индексу и свойство только для чтения для получения общего количества
элементов. */

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private final List<T> elements;

    public MyList() {
        elements = new ArrayList<>();
    }

    public void add(T item) {
        elements.add(item);
    }

    public T get(int index) {
        return elements.get(index);
    }

    public int getSize() {
        return elements.size();
    }

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("First string");
        myList.add("Second string");

        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println(myList.get(i));

        }
    }
}