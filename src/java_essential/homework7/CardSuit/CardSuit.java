package java_essential.homework7.CardSuit;

/* Создайте перечисление CardSuit, представляющее масти игральных карт:
Пики (SPADES), Черви (HEARTS), Бубны (DIAMONDS) и Трефы (CLUBS).
Каждая масть должна иметь метод getColor(), который возвращает цвет масти. */

public enum CardSuit {
    SPADES("black"),    // Пики
    DIAMONDS("red"), // Бубны
    HEARTS("red"),   // Черви
    CLUBS("black");    // Трефы

    private final String color;

    CardSuit(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Suit: " + name() + ", Color: " + getColor();
    }
}

