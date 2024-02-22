package algorithms.arrays;

import java.util.Arrays;

public class SortBinaryArrayLinearTime {

    public static void sortBinaryArrayFirst(int[] binArray) {

        int zerosCount = 0;
        for (int j : binArray) {
            if (j == 0) {
                zerosCount++;
            }
        }

        int i = 0;
        while (zerosCount-- != 0) {
            binArray[i++] = 0;
        }

        while (i < binArray.length) {
            binArray[i++] = 1;
        }

    }

    public static void sortBinaryArraySecond(int[] binArray) {

        int i = 0;

        for (int currBit : binArray) {
            if (currBit == 0) {
                binArray[i++] = 0;
            }
        }

        for (int j = i; j < binArray.length; j++) {
            binArray[i++] = 1;
        }

    }

    public static void sortBinaryArrayThird(int[] binArray) {
        // Partitioning logic of Quicksort

        int pivot = 1;
        int j = 0;

        for (int i = 0; i < binArray.length; i++) {

            if (binArray[i] < pivot) {
                swap(binArray, i, j);
                j++;
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] testCaseFirst = {0, 0, 1, 0, 1, 1, 0, 1, 0, 0};
        sortBinaryArrayFirst(testCaseFirst);
        System.out.println(Arrays.toString(testCaseFirst));

        int[] testCaseSecond = {0, 1, 1, 1, 0, 0, 0, 1, 0, 0};
        sortBinaryArraySecond(testCaseSecond);
        System.out.println(Arrays.toString(testCaseSecond));

        int[] testCaseThird = {0, 1, 1, 1, 0, 0, 0, 1, 0, 0};
        sortBinaryArrayThird(testCaseThird);
        System.out.println(Arrays.toString(testCaseThird));

    }

}
