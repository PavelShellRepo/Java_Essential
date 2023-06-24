package java_essential.homework8.book;

/*Создайте программу для учета книг в библиотеке. Описать класс Book с полями:

 Название книги;
 Автор книги;
 Год издания книги.

Программа должна выполнять следующие действия:
 Ввод данных о книгах с клавиатуры в массив, состоящий из трех элементов типа Book.
 Отсортировка массива по году издания книги.
 Год издания < 1500 является ошибкой.
 Обработка исключений некорректного ввода года издания.*/

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book name: " + name + " | " + "Book author: " + author + " | " + "Book year: " + year;
    }
}
