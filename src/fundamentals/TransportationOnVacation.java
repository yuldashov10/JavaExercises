package fundamentals;

public class TransportationOnVacation {
    public static void main(String[] args) {

        // Original Kata: https://www.codewars.com/kata/568d0dd208ee69389d000016

        // Sample Tests
        // 40, 80, 100, 140, 180, 220, 230, 270, 310, 350
        int[] testValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int num : testValues) {
            System.out.println(rentalCarCost(num));
        }
    }

    public static int rentalCarCost(int d) {
        int totalCost = 0;

        if (d >= 7) {
            totalCost += (d * 40) - 50;
        } else if (d >= 3) {
            totalCost += (d * 40) - 20;

        } else {
            totalCost += d * 40;
        }

        return totalCost;
    }
}
