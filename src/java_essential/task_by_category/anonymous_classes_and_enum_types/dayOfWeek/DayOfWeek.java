package java_essential.task_by_category.anonymous_classes_and_enum_types.dayOfWeek;

enum DaysOfWeek {
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
