package fundamentals;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {

        String s = "";

        for (int i = 0; i < repeat; i++) {
            s += string;
        }

        return s;

// №2
//        StringBuilder s = new StringBuilder();
//
//        for (int i = 0; i < repeat; i++) {
//            s.append(string);
//        }
//
//        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(4, "a"));  // aaaa
        System.out.println(repeatStr(3, "Hello"));  // HelloHelloHello
        System.out.println(repeatStr(5, ""));  // ""
        System.out.println(repeatStr(0, "kata"));
    }
}
