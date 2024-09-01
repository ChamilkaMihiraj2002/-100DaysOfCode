import java.text.DecimalFormat;
import java.util.Scanner;

public class area_of_a_rectangle_withdecimal {
    static Scanner reader = new Scanner(System.in);
    public static double getInput (String data) {
        System.out.print("Enter " + data + " : ");
        return reader.nextDouble();
    }
    public static double area(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        double height = getInput("height");
        double width  = getInput("width");
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Area of a rectangle : " + df.format(area(height, width)));
        reader.close();
    }
}
