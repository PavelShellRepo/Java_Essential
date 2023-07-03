package java_essential;

import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, -6, -7, -8};
        List<Integer> integerList = Arrays.asList(2, 4, 6, 8, 10);

        System.out.println(calculatePositivePercentage(numbers));
        System.out.println(calculateAverage(integerList));
    }

    public static double calculatePositivePercentage(int[] numbers) {
        int positive = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positive++;
            }
        }
        return ((double) positive / numbers.length) * 100;
    }

    public static double calculateAverage(List<Integer> integerList) {
        int sum = 0;

        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }
        return (double) sum / integerList.size();
    }
}

