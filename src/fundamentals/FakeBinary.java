package fundamentals;

public class FakeBinary {
    public static void main(String[] args) {

        // Original Kata: https://www.codewars.com/kata/57eae65a4321032ce000002d

        String[] inputData = {
                "45385593107843568",  // 01011110001100111
                "509321967506747",  // 101000111101101
                "366058562030849490134388085",  // 011011110000101010000011011
        };

        for (String s : inputData) {
            System.out.println(fakeBin(s));
        }
    }

    public static String fakeBin(String numberString) {
        StringBuilder outLine = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++) {
            String ch = Character.toString(numberString.charAt(i));
            if (Integer.parseInt(ch) >= 5) {
                outLine.append("1");
            } else {
                outLine.append("0");
            }
        }
        return outLine.toString();
    }
}
