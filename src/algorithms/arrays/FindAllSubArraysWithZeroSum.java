package algorithms.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllSubArraysWithZeroSum {

    private static <K, V> void insertHelper(Map<K, List<V>> hashMap, K key, V value) {
        hashMap.putIfAbsent(key, new ArrayList<>());
        hashMap.get(key).add(value);
    }


    public static void findAllSubArraysWithZeroSum(int[] numbers) {
        Map<Integer, List<Integer>> hashMap = new HashMap<>();

        // the case when sub array with zero-sum starts from index 0
        insertHelper(hashMap, 0, -1);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (hashMap.containsKey(sum)) {
                List<Integer> subArray = hashMap.get(sum);

                for (int value : subArray) {
                    System.out.printf("Subarray [%d...%d]\n", value + 1, i);
                }
            }

            insertHelper(hashMap, sum, i);
        }
    }


    public static void main(String[] args) {

        // int[] testCase = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

        /*
        Subarray [0...2]
        Subarray [1...3]
        Subarray [2...5]
        Subarray [5...7]
        Subarray [0...9]
        Subarray [3...9]
        */

        int[] testCase = {4, 2, -3, -1, 0, 4};

        /*
        Subarray [4...4]
        Subarray [2...5]
        */

        findAllSubArraysWithZeroSum(testCase);

    }
}
