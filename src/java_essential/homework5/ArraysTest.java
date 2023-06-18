package java_essential.homework5;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] numbers1 = new int[5];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        numbers1[3] = 4;
        numbers1[4] = 5;

        System.out.println("Array 1: " + Arrays.toString(numbers1));

        int[] numbers2 = {1, 2, 3, 4, 5};

        System.out.println("Array 2: " + Arrays.toString(numbers2));

        //array methods

        //array fill
        int[] numbers3 = new int[5];
        Arrays.fill(numbers3, 1);
        System.out.println("Array 3 (fill 1) : " + Arrays.toString(numbers3));

        //sort
        int[] numbers4 = {4, 5, 1, 3, 2};
        Arrays.sort(numbers4);
        System.out.println("Array 4 (sorted) : " + Arrays.toString(numbers4));

        //compare two arrays
        String[] strings1 = {"one", "two", "three"};
        String[] strings2 = {"one", "two", "three"};
        boolean isEqual = Arrays.equals(strings1, strings2);

        System.out.println("Compare two string arrays - * strings1 and strings2 *: " + isEqual);

        //array copyOf
        int[] numbers5 = {1, 2, 3, 4, 5};
        int[] array6 = Arrays.copyOf(numbers5, 5);
        System.out.println("Array 5 (copyOf) : " + Arrays.toString(array6));

        // arrayCopy
        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[5];
        System.arraycopy(source, 0, destination, 0, source.length);

        System.out.println(Arrays.toString(destination));
     }
}
