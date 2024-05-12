package dp;
import java.util.Arrays;

public class Fibonacci {
    static int[] dp ;
    public static void main(String[] args) {
        int n = 5 ;
        dp = new int[n+1] ;

        Arrays.fill(dp,-1);
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        System.out.println("fibonacci - " + n);

        if (n <= 1) {
            return n ;
        }

        if (dp[n] == -1) {
            dp[n] = fibonacci(n-1) + fibonacci(n-2) ;
        }

        return dp[n] ;
    }
}
