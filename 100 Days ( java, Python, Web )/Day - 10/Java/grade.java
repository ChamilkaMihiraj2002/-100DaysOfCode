import java.util.Scanner;
public class grade {
    static Scanner reader = new Scanner(System.in);
    public static int getInt() {
        System.out.print("Enter marks :");
        return reader.nextInt();
    }

    public static String Grade(int marks) {
        if (marks >= 75) {
            return "A";
        } else if (marks >= 65) {
            return "B";
        } else if (marks >= 55) {
            return "C";
        } else if (marks >= 45) {
            return "s";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        int marks = getInt();
        System.out.println("Your grade is : " + Grade(marks));
        reader.close();
    }
}
