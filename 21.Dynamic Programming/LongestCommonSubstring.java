import java.util.Arrays;

public class LongestCommonSubstring {

    public static int longestCommonSubstring(String s1, String s2, int n, int m, int[][] dp, int[] max) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            dp[n][m] = 1 + longestCommonSubstring(s1, s2, n - 1, m - 1, dp,max);
            max[0]  = Math.max(max[0], dp[n][m]);
        } else {
            dp[n][m] = 0;
        }
        longestCommonSubstring(s1, s2, n - 1, m, dp,max);
        longestCommonSubstring(s1, s2, n, m - 1, dp,max);
        return dp[n][m];
    }

    public static int longestCommonSubstringTabulation(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(result, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abfce";

        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n + 1][m + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int result[] = {0};
        longestCommonSubstring(s1, s2, n, m, dp, result);

        System.out.println("Length of Longest Common Substring: " + result[0]);

        System.out.println("Length of Longest Common Substring using tabulation: " + longestCommonSubstringTabulation(s1, s2));
    }
}