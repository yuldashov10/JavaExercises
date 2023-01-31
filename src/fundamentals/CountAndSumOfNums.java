package fundamentals;

// TODO: https://www.codewars.com/kata/576bb71bbbcf0951d5000044/

import java.util.Arrays;

public class CountAndSumOfNums {
    public static void main(String[] args) {
        int[][] test = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15},  // 10,-65
                {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14},  // 8, -50
        };

        for (int[] elem : test) {
            System.out.println(Arrays.toString(countPositivesSumNegatives(elem)));
        }
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int positiveNum = 0;
        int negativeNum = 0;

        for (int x : input) {
            if (x > 0) {
                positiveNum += 1;
            } else if (x < 0) {
                negativeNum += x;
            }
        }
        return new int[]{positiveNum, negativeNum}; //return an array with count of positives and sum of negatives
    }
}
