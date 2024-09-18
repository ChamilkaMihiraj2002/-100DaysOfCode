import java.util.Scanner;
public class IsPrime {
    static Scanner reader = new Scanner(System.in);

    public static int getNumber() {
        System.out.print("Enter number : ");
        return reader.nextInt();
    }

    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return (count == 2)? true : false;
    }

    public static void main(String[] args) {
        String status;
        int value = getNumber();

        if (isPrime(value)) {
            status = "It is Prime Number : " ;
        } else {
            status = "It is not Prime Number : ";
        }

        System.out.println(status + value);
        reader.close();
    }
}
