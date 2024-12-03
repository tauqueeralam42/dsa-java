import java.util.*;

public class Knapsack01 {

    public static int knapsack(int val[], int wt[], int W, int n){
        if(n == 0 || W == 0){
            return 0;
        }

        if(wt[n-1] <= W){
            return Math.max(val[n-1] + knapsack(val, wt, W-wt[n-1], n-1), knapsack(val, wt, W, n-1));
        }else{
            return knapsack(val, wt, W, n-1);
        }
    }

    public static int memKnapsack(int val[], int wt[], int W, int n, int dp[][]){
        if(n == 0 || W == 0){
            return dp[n][W] = 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1] <= W){
            return dp[n][W] = Math.max(val[n-1] + memKnapsack(val, wt, W-wt[n-1], n-1, dp), memKnapsack(val, wt, W, n-1, dp));
        }else{
            return dp[n][W] = memKnapsack(val, wt, W, n-1, dp);
        }
    }

    public static int tabKnapsack(int val[], int wt[], int W){
        int dp[][] = new int[val.length+1][W+1];

        Arrays.fill(dp[0], 0);
        for(int arr[] : dp){
            arr[0] = 0;
        }

        for(int i = 1; i<=val.length; i++){
            for(int j = 1; j<=W; j++){
                if(wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[val.length][W];
    }

    public static void main(String[] args){
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;

        System.out.println(knapsack(val, wt, W, val.length));

        int dp[][] = new int[val.length+1][W+1];
        for(int arr[] : dp){
            Arrays.fill(arr, -1);
        }

        System.out.println(memKnapsack(val, wt, W, val.length, dp));

        System.out.println(tabKnapsack(val, wt, W));
    }
    
}
