package fundamentals;

public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {

        // return flower1 % 2 != flower2 % 2;

        if ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isLove(1, 4));  // true
        System.out.println(isLove(2, 2));  // false
        System.out.println(isLove(1, 1));  // false
        System.out.println(isLove(0, 1));  // true
    }
}
