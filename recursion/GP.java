public class GP {
    public static double gpSum(double a, double r, int k) {
       if (k == 0) {
        return 1;
        }
        return a * Math.pow(r, k - 1) + gpSum(a, r, k - 1);
    }

    public static void main(String[] args) {
        double a = 2;
        double r = 0.5;
        int k = 5;
        double sum = gpSum(a, r, k);
        System.out.println(sum);
    }
}
