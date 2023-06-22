package java_essential.homework7.CoffeeSize;

/*Задача: Перечисление CoffeeSize.
Создайте перечисление CoffeeSize, представляющее размеры кофе: Маленький (SMALL), Средний (MEDIUM) и Большой (LARGE).
Каждый размер должен иметь метод getDescription(), который возвращает описание размера кофе.*/

public enum CoffeeSize {
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("Large");

    private final String size;

    CoffeeSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return "Coffee: " + name() + "; Size: " + size;
    }
}
