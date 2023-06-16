package java_start.homework3;

/*Вычислите среднее арифметическое трех целочисленных значений и выведите его на экран.
С какой проблемой вы столкнулись? Какой тип переменных лучше использовать для корректного
отображения результата? */

public class ArithmeticAverage {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;

        int sum = x + y + z;
        double average = (double) sum / 3;

        System.out.println("Arithmetic Average: " + average);
    }
}
