/**
 * @author Delete020
 * @since 08/23/22 22:12 PM
 */
public class DecodeWays {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        char[] c = s.toCharArray();
        if (n == 0 || c[0] == '0') {
            return 0;
        }
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            dp[i + 1] = dp[i];
            if (c[i] == '0') {
                dp[i + 1] = 0;
            }
            if (i > 0 && (c[i - 1] == '1' || (c[i - 1] == '2' && c[i] <= '6'))) {
                dp[i + 1] += dp[i - 1];
            }
        }
        return dp[n];
    }
}