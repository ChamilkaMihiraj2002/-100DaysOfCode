import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

    public static void main(String[] args) {
        ArrayList<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        // Print all elements
        System.out.println("Original weekdays:");
        for (String day : weekdays) {
            System.out.println(day);
        }

        // Sort in increasing order
        Collections.sort(weekdays);
        System.out.println("\nWeekdays sorted alphabetically in increasing order:");
        for (String day : weekdays) {
            System.out.println(day);
        }

        // Sort in decreasing order
        Collections.reverse(weekdays);
        System.out.println("\nWeekdays sorted alphabetically in decreasing order:");
        for (String day : weekdays) {
            System.out.println(day);
        }

        // Remove elements starting with 't'
        removeElementsStartingWith(weekdays, 't');
        System.out.println("\nWeekdays after removing elements starting with 't':");
        for (String day : weekdays) {
            System.out.println(day);
        }
    }

    private static void removeElementsStartingWith(ArrayList<String> list, char c) {
        list.removeIf(day -> day.charAt(0) == c);
    }
}