package java_essential.homework8.book;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];

        System.out.println("Books information:");
        System.out.println(" ");

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1));
            System.out.print("Enter book name: ");
            String name = scanner.nextLine();
            System.out.print("Enter author: ");
            String author = scanner.nextLine();

            try {
                System.out.println("Year of book publication: ");
                int year = scanner.nextInt();
                if (year < 1500) {
                    System.out.println("Invalid year. Please try again.");
                    System.out.println(" ");
                    i--;
                }
                scanner.nextLine();
                books[i] = new Book(name, author, year);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter year (number > 1500): ");
                System.out.println(" ");
                scanner.nextLine();
                i--;
            }
        }
            Arrays.sort(books, Comparator.comparing(Book::getYear));

            System.out.println("Books information:");
            System.out.println(" ");
            for (Book book : books) {
                System.out.println(book.toString());
            }
            scanner.close();
        }
    }
