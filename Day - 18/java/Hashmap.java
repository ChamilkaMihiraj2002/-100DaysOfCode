import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        // Initialise a HashMap named students with Integer key and String value to save roll-numbers and names of students
        HashMap <Integer, String> map = new HashMap<>();

        // Add items to the HashMap students
        map.put(1, "Chamilka");
        map.put(2, "Anjana");
        map.put(3, "Dishma");
        map.put(4, "Ridmi");

        // Access items from the students HashMap using get() and print the students name
        for (int i = 1; i < 5; i++) {
            System.out.println(map.get(i));
        }
        System.out.println(" ");

        // Check if a key exists in the HashMap
        System.out.println("key exists in the HashMap : " + map.containsKey(0));

        // Remove an item from the HashMap
        map.remove(1);
        System.out.println("After remove key:1  :: " + map);

        // Print the number of elements(size) in the HashMap
        System.out.println("elements(size) in the HashMap : " + map.size());

        // Print all the students names one by one looping through the HashMap using keySet()
        for (Integer index : map.keySet()) {
            System.out.println(map.get(index));
        }

        // Print all the students names one by one  looping through the HashMap using entrySet()
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getValue());
        }

    }
}
