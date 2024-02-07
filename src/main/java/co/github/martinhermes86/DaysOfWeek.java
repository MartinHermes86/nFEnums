package co.github.martinhermes86;

public enum DaysOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int DayOfWeek;

    DaysOfWeek(int DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    public static String isWeekday(DaysOfWeek day) {
        if (day.DayOfWeek >= 1 && day.DayOfWeek <= 5) {
            return day.toString().toLowerCase();
        } else {
            return "Weekend";
        }
    }

}
