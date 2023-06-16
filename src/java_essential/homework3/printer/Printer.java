package java_essential.homework3.printer;

public class Printer {
    void print(String value) {
        System.out.println(value);
    }
}

class ColorPrinter extends Printer {
    @Override
    void print(String value) {
        System.out.println(value);
        System.out.println("Printed in color.");
    }
}

class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("some text");

        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print("Some text in color");
    }
}

