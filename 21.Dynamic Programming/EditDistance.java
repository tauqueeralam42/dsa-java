import java.util.*;;

public class EditDistance {

    public static int memoEditDistance(String s1, String s2, int n, int m, int dp[][]) {
        if (n == 0) {
            return dp[n][m] = m;
        }
        if (m == 0) {
            return dp[n][m] = n;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return dp[n][m] = memoEditDistance(s1, s2, n - 1, m - 1, dp);
        } else {
            return dp[n][m] = 1 + Math.min(memoEditDistance(s1, s2, n - 1, m - 1, dp),
                    Math.min(memoEditDistance(s1, s2, n - 1, m, dp), memoEditDistance(s1, s2, n, m - 1, dp)));
        }
    }

    public static void main(String[] args) {
        String s1 = "sunday";
        String s2 = "saturday";

        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n + 1][m + 1];
        for (int arr[] : dp) {
            Arrays.fill(arr, -1);
        }

        System.out.println(memoEditDistance(s1, s2, n, m, dp));
    }
}
