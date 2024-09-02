public class Integer_to_a_String_using_valueOf {
        public static void main(String[] args) {
            String validString = "123";
            String invalidString = "123x";
            Integer number;

            try {
                number = Integer.valueOf(validString);
                System.out.println("Converted integer: " + number);

                number = Integer.valueOf(invalidString);
                System.out.println("Converted integer: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer input");
            }
        }
}
