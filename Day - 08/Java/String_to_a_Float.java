import static java.lang.Float.parseFloat;

public class String_to_a_Float {
    public static void main(String[] args){
        String data = "10.251";
        try {
            float a = parseFloat(data);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input");
        }
    }
}
