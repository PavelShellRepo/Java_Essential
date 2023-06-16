package java_essential.homework1.computer;

/* Создать класс Computer, создать массив объектов Computers размером 5.
   Далее руками создать 5 экземпляров этого класса и записать в компьютер (используя loop)
*/

public class Computer {

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++) {
            Computer computer = new Computer();
            computers[i] = computer;
        }

        for (Computer computer : computers) {
            System.out.println("Computer: " + computer.toString());
            System.out.println();
        }
    }
}