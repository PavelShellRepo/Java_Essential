package java_essential.task_by_category.lists;

/*Реализуйте класс Student с полями для имени и среднего балла.
Создайте список студентов и добавьте несколько студентов с их именами и оценками.
Отсортируйте список по среднему баллу в порядке убывания, и выведите имена студентов в отсортированном порядке.*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public record Student(String name, double averageGrade) {

    public static class Main {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();

            students.add(new Student("Pavel", 94.2));
            students.add(new Student("Boris", 78.2));
            students.add(new Student("Anna", 88.9));

            //Sorting the list by average score in descending order
            students.sort((Comparator<Student>) Comparator.comparingDouble(Student::averageGrade));
            students.sort((Comparator<Student>) Comparator.comparing(Student::name));

            System.out.println("Список студентов в порядке убывания среднего балла:");
            for (Student student : students) {
                System.out.println(student.name());
            }
        }
    }
}
