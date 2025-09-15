import java.util.Scanner;

public class expPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.println(exp(x,n));
        sc.close();
    }
    public static int exp(int x, int n){
        if(n == 0){
            return 1;
        }
        return exp(x, n - 1) * x;
    }
    
}
