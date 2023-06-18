package java_essential.homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        ListIterator<Integer> iterator = numbers.listIterator();

        while (iterator.hasNext()) {
            int currentValue = iterator.next();
            iterator.set(currentValue + 1);
        }

        System.out.println(numbers);
    }
}
