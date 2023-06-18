package java_essential.homework4.Handler;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Открытие XML-документа");
    }

    @Override
    public void create() {
        System.out.println("Создание XML-документа");
    }

    @Override
    public void change() {
        System.out.println("Редактирование XML-документа");
    }

    @Override
    public void save() {
        System.out.println("Сохранение XML-документа");
    }
}