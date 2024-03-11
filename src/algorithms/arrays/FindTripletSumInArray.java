package algorithms.arrays;

import java.util.Arrays;


public class FindTripletSumInArray {
    public static void main(String[] args) {
        int[] testCase = {2, 7, 4, 0, 9, 5, 1, 3};
        int testTarget = 6;

        findAllTriplets(testCase, testTarget); // result: {0, 1, 5}, {0, 2, 4}, {1, 2, 3}
    }


    public static void findAllTriplets(int[] array, int target) {
        Arrays.sort(array);

        for (int i = 0; i < array.length - 3; i++) {

            int temp = target - array[i];
            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {

                if (array[left] + array[right] < temp) {
                    left++;
                } else if (array[left] + array[right] > temp) {
                    right--;
                } else {
                    System.out.printf("{%d, %d, %d} ", array[i], array[left], array[right]);
                    left++;
                    right--;
                }

            }
        }
    }

}
