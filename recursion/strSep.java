public class strSep {
    public static String pairStar(String s) {
        if (s.length() <= 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + "*" + pairStar(s.substring(1));
        } else {    
            return s.charAt(0) + pairStar(s.substring(1));
        }
    }
}
