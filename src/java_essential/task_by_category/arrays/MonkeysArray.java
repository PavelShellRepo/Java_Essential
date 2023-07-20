package java_essential.task_by_category.arrays;

import java.util.Arrays;

public class MonkeysArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countMonkeys(12)));

    }
    public static int[] countMonkeys(int count) {
        int[] monkeys = new int[count];

        if (count == 0) {
            return new int[0];
        }

        for (int i = 0; i < count; i++) {
            monkeys[i] = i + 1;
        }
        return monkeys;
    }
}
