enum weekdays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Day16Enums {
    public static void main(String[] args) {
        for (weekdays day: weekdays.values()) {
            System.out.println(day);
        }
    }
}
