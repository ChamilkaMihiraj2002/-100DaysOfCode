public class Arrays {
    public static void main(String[] args) {
        int[] array = {10,5,6,7,8,9,2,3,6,8};
        int total = 0;

        for (int j : array) {
            total += j;
        }

        System.out.println("Average is : " + ((double) (total/array.length)));
    }
}
