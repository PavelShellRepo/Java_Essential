package java_essential.homework4.Handler;

public class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Открытие DOC-документа");
    }

    @Override
    public void create() {
        System.out.println("Создание DOC-документа");
    }

    @Override
    public void change() {
        System.out.println("Редактирование DOC-документа");
    }

    @Override
    public void save() {
        System.out.println("Сохранение DOC-документа");
    }
}
