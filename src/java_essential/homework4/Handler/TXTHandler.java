package java_essential.homework4.Handler;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Открытие TXT-документа");
    }

    @Override
    public void create() {
        System.out.println("Создание TXT-документа");
    }

    @Override
    public void change() {
        System.out.println("Редактирование TXT-документа");
    }

    @Override
    public void save() {
        System.out.println("Сохранение TXT-документа");
    }
}