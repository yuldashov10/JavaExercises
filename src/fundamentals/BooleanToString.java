package fundamentals;


// TODO: https://www.codewars.com/kata/551b4501ac0447318f0009cd/train/java

public class BooleanToString {
    public static void main(String[] args) {
        System.out.println(convert(true));

    }

    public static String convert(boolean b) {
//        return Boolean.toString(b);
        return String.valueOf(b);
    }
}
