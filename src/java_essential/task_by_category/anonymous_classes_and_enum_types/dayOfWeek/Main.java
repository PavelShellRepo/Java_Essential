package java_essential.task_by_category.anonymous_classes_and_enum_types.dayOfWeek;


public class Main {
    public static void main(String[] args) {
        DaysOfWeek currentDay  = DaysOfWeek.MONDAY;

        // Check if the current day of the week is a day off
        if (currentDay.isWeekend()) {
            System.out.println("Текущий день недели является выходным");
        } else {
            System.out.println("Текущий день недели не является выходным");
        }
    }
}
