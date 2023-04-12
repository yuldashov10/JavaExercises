package fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class ZywOo {

    public static int[] multipleOfIndex(int[] array) {
        ArrayList<Integer> multiples = new ArrayList<Integer>();

        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                multiples.add(array[i]);
            }
        }

        int[] res = new int[multiples.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = multiples.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] testValues = {
                {22, -6, 32, 82, 9, 25},  // [-6, 32, 25]
                {68, -1, 1, -7, 10, 10},  // [-1, 10]
                {-56, -85, 72, -26, -14, 76, -27, 72, 35, -21, -67, 87, 0, 21, 59, 27, -92, 68},  // [-85, 72, 0, 68]
                {11, -11},  // [-11]
                {28, 38, -44, -99, -13, -54, 77, -51},  // [38, -44, -99]
                {-1, -49, -1, 67, 8, -60, 39, 35},  // [-49, 8, -60, 35]
        };

        for (int[] item : testValues) {
            System.out.println(Arrays.toString(multipleOfIndex(item)));
        }
    }
}
