public class stringManipulate {
    public static void main(String[] args) {
        String str = "xaxb";
        System.out.println(strMan(str, 0));
    }

    private static String strMan(String str, int i) {
        if (i == str.length()) {
            return "";
        }
        if (str.charAt(i) == 'x') {
            return strMan(str, i + 1);
        } else {
            return str.charAt(i) + strMan(str, i + 1);
        }
    }
}
