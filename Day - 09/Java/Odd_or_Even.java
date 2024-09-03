import java.util.Scanner;

public class Odd_or_Even {
    static Scanner reader = new Scanner(System.in);

    public static int getInput(String data) {
        System.out.print(data + ": ");
        return reader.nextInt();
    }

    public static boolean evenOrodd(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int number = getInput("Number :");
        if (evenOrodd(number)) {
            System.out.println(number + " is even number.");
        } else {
            System.out.println(number + " is odd number.");
        }

        reader.close();
    }
}
