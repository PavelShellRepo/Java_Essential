package java_essential.task_by_category.static_and_nested_classes.mathUtils;

/*Создайте класс MathUtils, в котором реализуйте статические методы для выполнения математических операций,
таких как вычисление суммы, произведения и нахождение наибольшего числа из двух чисел.
Используйте эти методы в главном классе Main для выполнения математических операций с числами.*/

public class Main {
    public static void main(String[] args) {
        double num1 = 11.5;
        double num2 = 6.2;

        double sum = MathUtils.sum(num1, num2);
        System.out.println("Сумма чисел " + num1 + " и " + num2 + " равна " + sum);

        double multiply = MathUtils.multiply(num1, num2);
        System.out.println("Произведение чисел " + num1 + " и " + num2 + " равно " + multiply);

        double maxNumber = MathUtils.maxNum(num1, num2);
        System.out.println("Наибольшее число между " + num1 + " и " + num2 + " это " + maxNumber);
    }
}
