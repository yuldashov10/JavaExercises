package fundamentals;

public class FindNeedle {
    public static void main(String[] args) {

        // Original Kata: https://www.codewars.com/kata/56676e8fabd2d1ff3000000c

        Object[][] haystacks = {
                {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false}, // 3
                {"283497238987234", "a dog", "a cat", "some random junk",
                        "a piece of hay", "needle", "something somebody lost a while ago"},  // 5
                {1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 4, 5, 6, 67, 5, 5, 3, 3, 4, 2, 34, 234, 23, 4, 234, 324, 324,  // 30
                        "needle", 1, 2, 3, 4, 5, 5, 6, 5, 4, 32, 3, 45, 54},
        };

        for (int i = 0; i < haystacks.length; i++) {
            System.out.println(findNeedle(haystacks[i]));
        }
    }

    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if ((haystack[i] != null) && (haystack[i] instanceof String) && (haystack[i].equals("needle"))) {
                return String.format("found the needle at position %d", i);
            }
        }
        return "not found";
    }
}
