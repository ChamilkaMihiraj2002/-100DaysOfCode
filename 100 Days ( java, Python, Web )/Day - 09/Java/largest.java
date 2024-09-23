import java.util.Scanner;

public class largest {
    static Scanner reader = new Scanner(System.in);

    public static int getInt(int number) {
        System.out.print("Number " + number + " : ");
        return reader.nextInt();
    }

    public static void main(String[] args) {
        int count = 3, max = 0;
        int[] array = new int[count];


        for (int i = 0; i<count; i++) {
            array[i] = getInt(i+1);
        }

        for (int i = 0; i < count; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Largest number is : " + max);
    }
}
