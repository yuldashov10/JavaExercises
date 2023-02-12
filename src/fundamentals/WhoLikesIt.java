package fundamentals;

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        String outLine = "";

        if (names.length == 0) {
            outLine = "no one likes this";
        } else if (names.length == 1) {
            outLine = String.format("%s likes this", names[0]);
        } else if (names.length == 2) {
            outLine = String.format("%s and %s like this", names[0], names[1]);
        } else if (names.length == 3) {
            outLine = String.format("%s, %s and %s like this", names[0], names[1], names[2]);
        } else {
            outLine = String.format("%s, %s and %d others like this",
                    names[0], names[1], names.length - 2);
        }

        return outLine;
    }
}
