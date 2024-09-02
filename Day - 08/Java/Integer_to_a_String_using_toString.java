public class Integer_to_a_String_using_toString {
    public static void main(String[] args) {
        int data = 20;
        try{
            String dataString = Integer.toString(data);
            System.out.println(dataString);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
