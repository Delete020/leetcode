/**
 * @author Delete020
 * @since 08/17/22 21:41 PM
 */
public class CountingBits {
    public int[] countBits(int n) {
        if (n == 0) return new int[]{0};
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = i % 2 == 0 ? dp[i / 2] : dp[i / 2] + 1;
        }
        return dp;
    }
}