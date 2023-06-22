package java_essential.homework7.DaysOfWeek;

/*Создайте перечисление DaysOfWeek, содержащее дни недели.
Каждый день должен иметь метод isWeekend(), который возвращает true, если это выходной день, и false в противном случае.*/

public enum DaysOfWeek {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(false);

    private final boolean isWeekend;

    DaysOfWeek(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}

