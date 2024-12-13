import java.util.*;

public class UnboundedKnapsack {

    public static int memoKnapsack(int val[], int wt[], int W, int n, int dp[][]){
        if(n == 0 || W == 0){
            return dp[n][W] = 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1] <= W){
            return dp[n][W] = Math.max(val[n-1] + memoKnapsack(val, wt, W-wt[n-1],n, dp), memoKnapsack(val, wt, W,n-1, dp));
        }else{
            return dp[n][W] = memoKnapsack(val, wt, W,n-1, dp);
        }
    }

    public static void main(String[] args){
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;

        int dp[][] = new int[val.length+1][W+1];
        for(int arr[] : dp){
            Arrays.fill(arr, -1);
        }
        System.out.println(memoKnapsack(val, wt, W,val.length, dp));
    }
    
}

