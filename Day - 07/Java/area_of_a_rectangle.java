import java.util.Scanner;

public class area_of_a_rectangle {
    static Scanner reader = new Scanner(System.in);
    public static int getInput (String data) {
        System.out.print("Enter " + data + " : ");
        return reader.nextInt();
    }
    public static int area(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        int height = getInput("height");
        int width  = getInput("width");

        System.out.println("Area of a rectangle : " + area(height, width));
        reader.close();
    }
}
