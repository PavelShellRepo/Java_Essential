package java_essential.homework8.price;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Price[] prices = new Price[2];

        System.out.println("Products information: ");
        System.out.println(" ");

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Product: " + (i + 1));
            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter store name: ");
            String sellerName = scanner.nextLine();

            try {
                System.out.print("Enter price in UAH: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                prices[i] = new Price(productName, sellerName, price);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid price.");
                scanner.nextLine();
                i--;
            }
        }

        Arrays.sort(prices, Comparator.comparing(Price::getProductSeller));

        System.out.println(" ");
        System.out.println("Products information (sorted by store name):");
        System.out.println(" ");

        for (Price price : prices) {
            System.out.println(price.toString());
        }
        scanner.close();
    }
}

