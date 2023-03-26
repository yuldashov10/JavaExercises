package six_kyu;

public class ASum {

    public static long findNb(long m) {
        long prod = 1;
        long result = 0;

        while (result <= m) {

            result += (long) Math.pow(prod, 3);  // -> result += prod * prod * prod;

            if (result == m) {
                return prod;
            }

            prod++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findNb(4183059834009L));  // 2022
        System.out.println(findNb(24723578342962L));  // -1
        System.out.println(findNb(135440716410000L));  // 4824
        System.out.println(findNb(40539911473216L));  // 3568
    }
}
