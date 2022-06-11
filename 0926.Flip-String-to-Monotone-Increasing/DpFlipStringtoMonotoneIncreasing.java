/**
 * @author Delete020
 * @since 6/11/22 1:47 PM
 */
public class DpFlipStringtoMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        int[][] dp = new int[s.length() + 1][2];
        int i = 1;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                dp[i][0] = dp[i - 1][0];
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + 1;
            } else {
                dp[i][0] = dp[i - 1][0] + 1;
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]);
            }
            i++;
        }

        return Math.min(dp[i - 1][0], dp[i - 1][1]);
    }
}
