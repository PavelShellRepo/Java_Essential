package java_essential.homework9;

/* Создайте класс MyDictionary<TKey,TValue>. Реализуйте в простейшем приближении возможность
использования его экземпляра. Минимально требуемый интерфейс взаимодействия с экземпляром,
должен включать метод добавления пар элементов, индексатор для получения значения элемента по
указанному индексу и свойство только для чтения для получения общего количества пар элементов.*/

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<TKey, TValue> {
    private Map<TKey, TValue> map;

    public MyDictionary() {
        map = new HashMap<>();
    }

    public void add(TKey key, TValue value) {
        map.put(key, value);
    }

    public TValue get(TKey key) {
        return map.get(key);
    }

    public int getSize() {
        return map.size();
    }

    public static void main(String[] args) {
        MyDictionary<String, Integer> myDictionary = new MyDictionary<>();
        myDictionary.add("one", 1);
        myDictionary.add("two", 2);

        System.out.println("Value for key 'one': " + myDictionary.get("one"));
        System.out.println("Value for key 'two': " + myDictionary.get("two"));
        System.out.println("Size of the dictionary: " + myDictionary.getSize());
    }
}
