package fundamentals;


// TODO https://www.codewars.com/kata/53dc23c68a0c93699800041d/solutions/java

public class SentenceSmash {
    public static void main(String[] args) {
        String[] test = {"hello", "world", "this", "is", "great"};
        System.out.println(smash(test));
    }

    public static String smash(String... words) {

        return String.join(" ", words);

    }
}
