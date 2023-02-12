package fundamentals;

public class Consonants {
    public static int getCount(String str) {
        String constants = "bcdfghjklmnpqrstvwxyz";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            if (constants.contains(ch.toLowerCase())) {
                count++;
            }
        }
        return count;
    }
}


