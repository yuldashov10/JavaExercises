package fundamentals;

// TODO: https://www.codewars.com/kata/5556282156230d0e5e000089/

public class DNAToRNA {
    public static void main(String[] args) {
        String[] test = {
                "TTTT",  // "UUUU"
                "GCAU",  // GCAT
        };

        for (String item : test) {
            System.out.println(dnaToRna(item));
        }
    }

//    public static String dnaToRna(String dna) {
//        StringBuilder res = new StringBuilder();
//
//        for (int i = 0; i < dna.length(); i++) {
//            if (dna.charAt(i) == 'T') {
//                res.append('U');
//                continue;
//            }
//            res.append(dna.charAt(i));
//        }
//        return res.toString();
//    }
    public static String dnaToRna(String dna) {
        return dna.replace("T", "U");
    }
}
