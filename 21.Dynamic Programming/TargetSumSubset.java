public class TargetSumSubset{

    public static boolean rec(int arr[], int t, int n){
        if(t == 0){
            return true;
        }
        if(n == 0){
            return false;
        }

        if(arr[n-1] <= t){
            return rec(arr, t-arr[n-1], n-1) || rec(arr, t, n-1);
        }else{  
            return rec(arr, t, n-1);
        }
    }

    public static boolean mem(int arr[], int t, int n, boolean dp[][]){
        if(t == 0){
            return dp[n][t] = true;
        }
        if(n == 0){
            return dp[n][t] = false;
        }

        if(dp[n][t]){
            return dp[n][t];
        }

        if(arr[n-1] <= t){
            return dp[n][t] = mem(arr, t-arr[n-1], n-1, dp) || mem(arr, t, n-1, dp);
        }else{  
            return dp[n][t] = mem(arr, t, n-1, dp);
        }
    }

    public static boolean tab(int arr[], int t){
        boolean dp[][] = new boolean[arr.length+1][t+1];

        for(boolean a[] : dp){
            a[0] = true;
        }

        for(int i = 1; i<=arr.length; i++){
            for(int j = 1; j<=t; j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[arr.length][t];
    }

    public static void main(String[] args){
        int arr[] = {4,2,7,1,3};
        int target = 10;

        System.out.println(rec(arr, target, arr.length));  
        
        
        boolean dp[][] = new boolean[arr.length+1][target+1];
        System.out.println(mem(arr, target, arr.length, dp));

        System.out.println(tab(arr, target));

        
    }
}