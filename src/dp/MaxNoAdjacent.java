package dp;
import java.util.Arrays ;
public class MaxNoAdjacent {
    static int[] dp;
    public static void main(String args[]) {
        int[][] arr = {  {3,8,9,5,12,11},  {4,1,2,7,9,17}  } ;
        int n = 6 ;
        dp = new int[n];
        Arrays.fill(dp, -1) ;
        System.out.println(maxNoAdjacent(arr,n-1)) ;
    }

    public static int maxNoAdjacent(int[][] arr, int i) {
        System.out.println("Call input :" + i);
        if (i < 0)      { return 0;     }
        if(dp[i] != -1) { return dp[i]; }

        dp[i]  = Math.max(maxNoAdjacent(arr,i-2) + Math.max(arr[0][i], arr[1][i])
                           , maxNoAdjacent(arr,i-1));

        return  dp[i];
    }
}