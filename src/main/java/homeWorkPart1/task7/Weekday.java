package homeWorkPart1.task7;

public enum Weekday {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private boolean isWeekDay;

    Weekday(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public boolean isWeekDay() {
        return isWeekDay;
    }

    public boolean isHoliday() {
        return !isWeekDay;
    }


    public String whichIsGreater(Weekday indicatedDayOfWeek) {

        int result = this.compareTo(indicatedDayOfWeek);

        if (result < 0) {
            //day comes before the other
            return this + " is predecessor of " + indicatedDayOfWeek;
            //day comes after the other
        } else if (result > 0) {
            return this + " is successor of " + indicatedDayOfWeek;
        } else {
            return this + " is the same as " + indicatedDayOfWeek;
        }
    }
}
