public class Basic_Arithmetic_Operations {
    public static int add(int x, int y) {
        return x + y;
    }

    public  static int subtract (int x, int y) {
        return x - y;
    }

    public static int multi (int x, int y) {
        return x * y;
    }

    public static double division (int x, int y) {
        return (double) x / y;
    }

    public static void main(String[] args){
        int number_1 = 10;
        int number_2 = 20;

        System.out.println(add(number_1, number_2));
        System.out.println(subtract(number_1, number_2));
        System.out.println(multi(number_1, number_2));
        System.out.println(division(number_1, number_2));

    }
}
