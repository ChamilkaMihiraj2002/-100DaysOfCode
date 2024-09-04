
import java.util.Scanner;

public class sum_of_even_integers {
    static Scanner reader = new Scanner(System.in);
    public static int getInt(String data) {
        System.out.print("Enter " + data + " : ");
        return reader.nextInt();
    }

    public static int getEven(int number) {
        if (number % 2 == 0) {
            return number;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int total = 0;
        int n = getInt("Number");
        for (int i = 0; i < n; i++) {
            if (getEven(i) != 0) {
                total += i;
            }
        }
        System.out.println(total);
        reader.close();
    }
}
