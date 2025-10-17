package CodeForces;

// import java.util.Scanner;

// public class sum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int test = sc.nextInt();

//         while (test-- > 0) {
//             solve_kro(sc);
//         }

//     }

//     private static void solve_kro(Scanner sc){
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
//         int n3 = sc.nextInt();
//         if((n1+n2==n3)||(n2+n3==n1)||(n1+n3==n2)){
//             System.out.println("yes");
//         }
//         else{
//             System.out.println("no");
//         }
//     }
// }
import java.util.*;
    public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0) {
            solve(sc);
        }
        
    }
    private static void solve(Scanner sc) {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        if((a== b+c) || (b== a+c) || (c== a+b) ){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}