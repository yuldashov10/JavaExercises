package fundamentals;

public class VowelRemover {
    public static void main(String[] args) {
        System.out.println(shortcut("you"));
    }
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}

