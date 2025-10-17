public class strChecker {
    public static void main(String[] args) {
		String str = "abbabba";
		System.out.println(strCheck(str,0));
	}

	private static boolean strCheck(String str, int i) {
		if (i == str.length()) {
			return true;
		}
		if (str.charAt(i) != 'a') {
			return false;
		}
		if (i + 1 < str.length() && str.charAt(i + 1) == 'a') {
			return strCheck(str, i + 1);
		}
		if (i + 2 < str.length() && str.charAt(i + 1) == 'b' && str.charAt(i + 2) == 'b') {
			return strCheck(str, i + 3);
		}
		if (i + 1 == str.length()) {
			return true;
		}
		return false;
	}


}
