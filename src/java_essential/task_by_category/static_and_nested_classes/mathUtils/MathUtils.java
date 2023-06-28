package java_essential.task_by_category.static_and_nested_classes.mathUtils;

/*Создайте класс MathUtils, в котором реализуйте статические методы для выполнения математических операций,
таких как вычисление суммы, произведения и нахождение наибольшего числа из двух чисел.
Используйте эти методы в главном классе Main для выполнения математических операций с числами.*/

public class MathUtils {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double maxNum(double a, double b) {
        return Math.max(a, b);
    }
}
