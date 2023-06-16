package java_essential.homework1.book;

/*Используя IDEA, создайте проект c пакетом.
Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен
содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
книги, имя автора и Содержание.*/

public class Book {

    public static void main(String[] args) {
        Title title = new Title();
        title.setTitle("Гарри Поттер и Философский камень");

        Author author = new Author();
        author.setAuthor("Джоан Роулинг");

        Content content = new Content();
        content.setContent("Книга рассказывает о приключениях юного волшебника Гарри Поттера...");

        title.show();
        author.show();
        content.show();
    }
}
