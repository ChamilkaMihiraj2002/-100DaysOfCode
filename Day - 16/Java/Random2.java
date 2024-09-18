import java.util.Scanner;
import java.lang.Math;

public class Random2 {
    static Scanner reader = new Scanner(System.in);

    public static int getInt(String data) {
        System.out.print("Enter number "+ data +" : ");
        return reader.nextInt();
    }

    public static int number(int max, int min) {
        return (int)(Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        int x = getInt("01"), y = getInt("02");
        System.out.println("Random number is : " + number(x,y));
        reader.close();
    }
}
