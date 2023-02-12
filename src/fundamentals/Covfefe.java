package fundamentals;


public class Covfefe {
    //    public static String covfefe(String tweet) {
//        if (tweet.contains("coverage")) {
//            tweet = tweet.replaceAll("coverage", "covfefe");
//            return tweet;
//        }
//        tweet += " covfefe";
//        return tweet;
//
//    }
    public static String covfefe(String tweet) {
        if (!tweet.contains("coverage")) {
            return tweet + " covfefe";
        }
        return tweet.replaceAll("coverage", "covfefe");
    }
}
