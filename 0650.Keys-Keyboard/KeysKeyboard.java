/**
 * @author Delete020
 * @since 08/23/22 22:10 PM
 */
public class KeysKeyboard {
    public int minSteps(int n) {
        if (n <= 1) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    dp[i] = dp[j] + dp[i / j];
                    break;
                }
            }
        }
        return dp[n];
    }
}