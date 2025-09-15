public class strToNum {
    public static int strTonum(String str, int i) {
        if (i == str.length()) {
            return 0;
        }
        char ch = str.charAt(str.length()-i-1);
        int n = ch-'0';
        return n * (int)Math.pow(10, i) + strTonum(str, i + 1);
    }
    public static int strTonumBetter(String str, int i,int ans) {
        if (i == str.length()) {
            return ans;
        }
        char ch = str.charAt(str.length()-i-1);
        int n = ch-'0';
        ans = ans*10+n;
        return ans + strTonum(str, i + 1);
    }
    public static void main(String[] args) {
        System.out.println(strTonumBetter("00001203", 0,0));
    }
}
