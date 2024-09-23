import java.util.Arrays;

public class Arrays2D {
    static int max = 0;
    public static int[] max_row(int[][] array) {
        int[] max_list = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            max_list[i] = max;
            max = 0;
        }
        return max_list;
    }

    public static int[] max_column(int[][] array) {
        int[] max_list = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[j][i] > max) {
                    max = array[j][i];
                }
            }
            max_list[i] = max;
            max = 0;
        }
        return max_list;
    }

    public static void main(String[] args) {
        int[][] array = {
            {23, 45, 78, 12},
            {56, 90, 34, 67},
            {89, 21, 43, 76}
        };

        System.out.println(Arrays.toString(max_row(array)));
        System.out.println(Arrays.toString(max_column(array)));
    }
}
