import static java.lang.Integer.parseInt;

public class String_to_an_Integer {
    public static void main(String[] args){
        String data = "10";
        try {
            int a = parseInt(data);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input");
        }
    }
}
