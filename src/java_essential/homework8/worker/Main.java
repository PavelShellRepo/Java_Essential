package java_essential.homework8.worker;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Worker[] workers = new Worker[3];

        System.out.println("*CREATE WORKER DATA*");
        System.out.println(" ");

        for (int i = 0; i < workers.length; i++) {
            System.out.println("Worker " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Surname: ");
            String surname = input.nextLine();
            System.out.print("Position: ");
            String position = input.nextLine();

            int yearOfEmployment = 0;
            boolean isValidYear = false;
            while (!isValidYear) {
                System.out.print("Year of Employment: ");
                String yearInput = input.nextLine();
                try {
                    yearOfEmployment = Integer.parseInt(yearInput);
                    isValidYear = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid year format. Please enter a numeric value.");
                }
            }

            workers[i] = new Worker(name, surname, position, yearOfEmployment);
        }

        Arrays.sort(workers);

        System.out.println("Enter the number of years of work experience: ");
        int yearsOfExperience = input.nextInt();

        System.out.println("Workers with experience exceeding " + yearsOfExperience + " years:");

        for (Worker worker : workers) {
            if (worker.calculateExperience() > yearsOfExperience) {
                System.out.println(worker.name);
            }
        }
    }
}
