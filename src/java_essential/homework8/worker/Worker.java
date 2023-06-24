package java_essential.homework8.worker;

/*Требуется:
Описать класс с именем Worker, содержащую следующие поля:
 фамилия и инициалы работника;
 название занимаемой должности;
 год поступления на работу.

Написать программу, выполняющую следующие действия:
 ввод с клавиатуры данных в массив, состоящий из трех элементов типа Worker (записи должны
быть упорядочены по алфавиту);
 если значение года введено не в соответствующем формате выдает исключение.
 вывод на экран фамилии работника, стаж работы которого превышает введенное значение.*/

public class Worker implements Comparable<Worker> {
    String name, surName, position;
    int yearOfEmployment;

    public Worker(String name, String surName, String position, int yearOfEmployment) {
        this.name = name;
        this.surName = surName;
        this.position = position;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int calculateExperience() {
        return java.time.Year.now().getValue() - yearOfEmployment;
    }

    @Override
    public int compareTo(Worker other) {
        return this.surName.compareTo(other.surName);
    }
}
