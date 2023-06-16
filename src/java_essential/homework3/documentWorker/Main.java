package java_essential.homework3.documentWorker;

/*Создайте класс DocumentWorker.
В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт",
"Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
Создайте производный класс ProDocumentWorker.
Переопределите соответствующие методы, при переопределении методов выводите следующие строки:
"Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах
доступно в версии Эксперт".
Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран
"Документ сохранен в новом формате".
В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается
экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться
экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker. */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter license key: ");
        String input = scanner.nextLine();

        if (input.equals("Pro")) {
            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
            System.out.println("Created: " + proDocumentWorker);
            System.out.println("Pro version is activated!");
        } else if (input.equals("Expert")) {
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            System.out.println("Created: " + expertDocumentWorker);
            System.out.println("Expert version is activated!");
        } else {
            DocumentWorker documentWorker = new DocumentWorker();
            System.out.println("Created: " + documentWorker);
            System.out.println("Trial version");
        }
    }
}
