public class sepStr {
    public static void main(String[] args) {
        String str = "hello";
        int i=0;
        System.out.println(sepString(str, i));
    }

    private static String sepString(String str, int i){
        if (i == str.length() - 1) {
            return String.valueOf(str.charAt(i));
        }

        if (str.charAt(i) == str.charAt(i + 1)) {
            return str.charAt(i) + "*" + sepString(str, i + 1);
        }
        return str.charAt(i) + sepString(str, i + 1);
    }
}
