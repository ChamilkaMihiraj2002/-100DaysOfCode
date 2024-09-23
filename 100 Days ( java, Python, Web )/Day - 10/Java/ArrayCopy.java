import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array = {10,20,30};

        int[] shallow_copy = array;
        int[] deepcopy = Arrays.copyOf(array, array.length);

        shallow_copy[0] = 1;
        array[0] = 9;
        deepcopy[0] = 5;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(shallow_copy));
        System.out.println(Arrays.toString(deepcopy));

    }
}
