package java_essential.homework4.Handler;

public class Main {
    public static void main(String[] args) {
        AbstractHandler xmlHandler = new XMLHandler();
        AbstractHandler txtHandler = new TXTHandler();
        AbstractHandler docHandler = new DOCHandler();

        xmlHandler.open();
        xmlHandler.create();
        xmlHandler.change();
        xmlHandler.save();

        System.out.println("----------------------");

        txtHandler.open();
        txtHandler.create();
        txtHandler.change();
        txtHandler.save();

        System.out.println("----------------------");

        docHandler.open();
        docHandler.create();
        docHandler.change();
        docHandler.save();
    }
}