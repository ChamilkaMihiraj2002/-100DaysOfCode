import java.util.*;

public class HashSet_I {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding the elements to the HasSet
        set.add("One");
        set.add("two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        System.out.println("HashSet values :: " + set);

        // Check if a value exists in the Set
        System.out.println("value exists in set : " + set.contains("Three"));

        // Remove a value from the Set
        set.remove("Three");
        System.out.println("HashSet values after remove :: " + set);

        // Print the number of values(size) in the Set
        System.out.println("Size of set : " + set.size());

        // Print all the values one by one  looping through the Set
        // Iterator variable create
        Iterator<String> i = set.iterator();
        System.out.print("\nAll elements in HashSet :: \n");
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }

        // Remove all values from the Set
        set.clear();
        System.out.println("\nHashSet values after remove all :: " + set);
        System.out.println("hashSet is empty :" + set.isEmpty());
    }
}
