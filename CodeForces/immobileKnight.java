// package CodeForces;

import java.util.Scanner;

public class immobileKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {
            solve_kro(sc);
        }
    }

    private static void solve_kro(Scanner sc){
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n == 1 || m == 1) {
            System.out.println("1 1");
        } else if (n == 2 && m == 2) {
            System.out.println("1 1");
        } else {
            System.out.println("2 2");
        }
    }
}
