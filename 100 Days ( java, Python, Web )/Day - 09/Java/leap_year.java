import java.util.Scanner;

public class leap_year {
    static Scanner reader = new Scanner(System.in);

    public static int getInput() {
        System.out.print("Year : ");
        return reader.nextInt();
    }

    public static boolean leap (int year) {
        return year % 400 == 0 && (year % 4 == 0 || year % 100 != 0);
    }

    public static void main(String[] args) {
        int year = getInput();
        if (leap(year)) {
            System.out.println(year + " is leap year!");
        }
        reader.close();
    }
}
