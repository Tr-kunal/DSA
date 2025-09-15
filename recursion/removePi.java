public class removePi {

    public static String replacePi(String str, int i) {
        if (i == str.length()) {
            return "";
        }

        if (i + 1 < str.length() && str.charAt(i) == 'p' && str.charAt(i + 1) == 'i') {
            return "3.14" + replacePi(str, i + 2);
        } else {
            return str.charAt(i) + replacePi(str, i + 1);
        }
    }

    public static void main(String[] args) {
        String input = "xpix";
        System.out.println(replacePi(input, 0));
    }
}
