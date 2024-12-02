import java.util.Arrays;

public class Fibonacci{

    public static int fibTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i =2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }

    public static int fibMem(int n,int dp[]){
        if(n==0 || n==1){
            return  dp[n] = n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = fibMem(n-1, dp) + fibMem(n-2,dp);
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println(fibTab(n));

        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibMem(n,dp));
        
    }
}