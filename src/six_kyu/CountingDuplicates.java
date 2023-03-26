package six_kyu;

import java.util.ArrayList;


public class CountingDuplicates {
    public static int duplicateCount(String text) {

        if (text.equals("")) {
            return 0;
        }

        ArrayList<Character> founded = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.toLowerCase().charAt(i);
            if (!founded.contains(currentChar)) {
                int counter = 0;
                for (int j = 0; j < text.length(); j++) {
                    if (text.toLowerCase().charAt(j) == currentChar) {
                        counter++;
                    }
                }
                if (counter > 1) {
                    founded.add(currentChar);
                }
            }
        }

        return founded.size();
    }

    public static void main(String[] args) {
        System.out.println(CountingDuplicates.duplicateCount("abcde"));  // 0
        System.out.println(CountingDuplicates.duplicateCount("aabbcde"));  // 2
        System.out.println(CountingDuplicates.duplicateCount("aabBcde"));  // 2
        System.out.println(CountingDuplicates.duplicateCount("indivisibility"));  // 1
        System.out.println(CountingDuplicates.duplicateCount("Indivisibilities"));  // 2
        System.out.println(CountingDuplicates.duplicateCount("aA11"));  // 2
        System.out.println(CountingDuplicates.duplicateCount("ABBA"));  // 2
    }
}
