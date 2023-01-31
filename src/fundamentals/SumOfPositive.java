package fundamentals;

// TODO: https://www.codewars.com/kata/5715eaedb436cf5606000381

public class SumOfPositive {
    public static void main(String[] args) {

        int[][] test = {
                {1, 2, 3, 4, 5},  // 15
                {1, -2, 3, 4, 5},  // 13
                {-1, -2, -3, -4, -5},  // 0
        };

        for (int[] item : test) {
            System.out.println(sum(item));
        }
    }

    public static int sum(int[] arr) {
        int total = 0;

        for (int n : arr) {
            if (n > 0)
                total += n;
        }

        return total;
    }
}
