import java.util.*;

public class RodCutting {

    public static int memoRodCutting(int length[], int price[], int n, int rodLength, int dp[][]) {
        if (n == 0 || rodLength == 0) {
            return dp[n][rodLength] = 0;
        }

        if(dp[n][rodLength] != -1){
            return dp[n][rodLength];
        }
        if(length[n-1] <= rodLength){
            return dp[n][rodLength]= Math.max(price[n-1]+memoRodCutting(length, price, n, rodLength-length[n-1], dp), memoRodCutting(length, price, n-1, rodLength, dp));

        }else{
            return dp[n][rodLength] = memoRodCutting(length, price, n-1, rodLength, dp);
        }
    }

    public static void main(String[] args) {
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int rodLength = 8;
        int n = length.length;

        int dp[][] = new int[n + 1][rodLength + 1];
        for (int arr[] : dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(memoRodCutting(length, price, n, rodLength, dp));
    }
}
