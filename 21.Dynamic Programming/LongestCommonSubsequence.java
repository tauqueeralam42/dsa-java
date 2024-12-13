import java.util.*;

public class LongestCommonSubsequence {

    public static int memoLCS(String s1, String s2, int n, int m, int dp[][]) {
        if (n == 0 || m == 0) {
            return dp[n][m] = 0;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return dp[n][m] = 1 + memoLCS(s1, s2, n - 1, m - 1, dp);
        } else {
            return dp[n][m] = Math.max(memoLCS(s1, s2, n - 1, m, dp), memoLCS(s1, s2, n, m - 1, dp));
        }
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";

        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n + 1][m + 1];
        for (int arr[] : dp) {
            Arrays.fill(arr, -1);
        }

        System.out.println(memoLCS(s1, s2, n, m, dp));
    }
}
