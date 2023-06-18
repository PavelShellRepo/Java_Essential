package java_essential.homework5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //add(E element)
        list.add("First string");
        System.out.println("Add first element: " + list);

        //add(int index, E element)
        list.add(0, "Second string");
        System.out.println("Add element 'Second string' to index 0: " + list);

        //remove(int index)
        list.remove(0);
        System.out.println("Delete element from index 0: " + list);

        //remove(Object o)
        list.remove("First string");
        System.out.println("Remove object 'First string' : " + list);

        ////clear
        list.clear();

        //
        list.add("New string1");
        list.add("New string2");
        list.add("New string3");
        list.add("New string4");
        System.out.println("Add 4 new strings to the list: " + list);

        //get(int index)
        System.out.println("Get item from index 1 : " + list.get(1));

        //set(int index, E element)
        list.set(2, "New string5");
        System.out.println("Set item 'New string5 to index 2' : " + list);

        //size()
        System.out.println("Current size of list: " + list.size());

        //toArray()
        String[] newArray = list.toArray(new String[5]);
        System.out.println("Copy list to new array: " + Arrays.toString(newArray));

        //indexOf(Object o)
        System.out.println("Get index of object 'New string4' :" +  list.indexOf("New string4"));

        //contains(Object o)
        boolean isContains = list.contains("New string4");
        System.out.println("List contains object 'New string3' ?: " + isContains);
    }
}
