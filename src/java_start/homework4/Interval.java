package java_start.homework4;

/* Cоздайте класс Interval.
Напишите программу определения, попадает ли указанное пользователем число от 0 до 100 в числовой
промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток. Если
пользователь указывает число, не входящее ни в один из имеющихся числовых промежутков, то
выводится соответствующее сообщение.  */

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int number;

        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number > 0 && number <= 14) {
            System.out.println("Число " + number + " " + "попадает в диапазон [0 - 14]");
        } else if (number > 14 && number <= 35) {
            System.out.println("Число " + number + " " + "попадает в диапазон [15 - 35]");
        } else if (number > 35 && number <= 50) {
            System.out.println("Число " + number + " " + "попадает в диапазон [36 - 50]");
        } else if (number > 50 && number <= 100) {
            System.out.println("Число " + number + " " + "попадает в диапазон [50 - 100]");
        } else {
            System.out.println("Число " + number + " " + "не попадает в диапазон [0 - 100]");
        }
    }
}
