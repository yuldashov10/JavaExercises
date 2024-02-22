package algorithms;

import java.util.Arrays;

public class FindPairInArray {


    private static void findPair(int[] numbers, int target) {

        Arrays.sort(numbers);

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            if ((numbers[left] + numbers[right]) == target) {
                System.out.printf("Pair found (%d, %d)", numbers[left], numbers[right]);
                return;
            }

            if ((numbers[left] + numbers[right]) < target) {
                left++;
            } else {
                right--;
            }

        }

        System.out.println("Pair not found");

    }

    public static void main(String[] args) {
        //  int[] testCase = {4, -2, 54, 23, 5, 7, 8, 23, 4, 9}; // Pair found (7, 8)
        //  int testTarget = 15;

        int[] testCase = {1, 4, 5, 8, 12, 3, 6};  // Pair not found
        int testTarget = 25;
        findPair(testCase, testTarget);
    }
}
