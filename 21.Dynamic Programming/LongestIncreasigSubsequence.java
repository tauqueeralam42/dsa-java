import java.util.*;

public class LongestIncreasigSubsequence {

    public static int LIS(int arr1[]){
        int n = arr1.length;
        int dp[] = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr1[i] > arr1[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;

    }
    

    public static void main(String[] args){
        int arr[] = {50,3,3,3,3,10,10,7,40,80};
        System.out.println(LIS(arr));
    }
}
