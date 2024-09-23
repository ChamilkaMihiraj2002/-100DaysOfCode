import java.util.Scanner;

public class Input_and_Output {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter number :");
        int number = reader.nextInt();

        System.out.print("Enter GPA :");
        double gpa = reader.nextDouble();

        reader.nextLine();
        System.out.print("Enter Name :");
        String name = reader.nextLine();

        System.out.print("Enter Is Student (true/false) :");
        boolean IsStudent = reader.nextBoolean();

        reader.close();

        System.out.println(number);
        System.out.println(gpa);
        System.out.println(name);
        System.out.println(IsStudent);
    }
}
