package fundamentals;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {

        int count = 0;

        for (Boolean item : arrayOfSheeps) {
            if ((item != null) && (item)) {
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Boolean[] array1 = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true
        };

        Counter obj = new Counter();

        System.out.println(obj.countSheeps(array1));
    }
}
