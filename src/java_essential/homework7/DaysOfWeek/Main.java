package java_essential.homework7.DaysOfWeek;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek monday = DaysOfWeek.MONDAY;
        DaysOfWeek saturday  = DaysOfWeek.SATURDAY;

        System.out.println(monday.isWeekend());
        System.out.println(saturday.isWeekend());
    }
}
