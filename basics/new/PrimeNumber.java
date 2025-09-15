import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        boolean isPrime = true;

        while (i < n) {
            if (n % i == 0) {
                isPrime = false;
                break;

            } else {
                i++;
            }
        }
        System.out.println(isPrime);
        sc.close();
    }
}