package homeWorkPart1.task7;

public class Main {

    public static void main(String[] args) {
        Weekday firstDay = Weekday.WEDNESDAY;
        Weekday secondDay = Weekday.FRIDAY;

        System.out.println(formatEnumDay(firstDay) + " is holiday = " + firstDay.isHoliday());
        System.out.println(formatEnumDay(firstDay) + " is weekday = " + firstDay.isWeekDay());

        System.out.println(firstDay.whichIsGreater(secondDay));
    }

    public static String formatEnumDay(Weekday day) {
        String toLowerCase = day.toString().toLowerCase();
        return toLowerCase.substring(0, 1).toUpperCase() + toLowerCase.substring(1);
    }
}
