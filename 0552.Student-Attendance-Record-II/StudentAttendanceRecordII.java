/**
 * @author Delete020
 * @since 09/16/22 22:31 PM
 */
public class StudentAttendanceRecordII {
    public int checkRecord(int n) {
        int[][] dp = new int[n + 1][6];
        int m = 1000000007;
        dp[0][0] = 1;
        dp[0][1] = 1;
        dp[0][3] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) dp[i][0] = (dp[i][0] + dp[i - 1][j]) % m;
            dp[i][1] = dp[i - 1][0] % m;
            dp[i][2] = dp[i - 1][1] % m;
            for (int j = 0; j < 6; j++) dp[i][3] = (dp[i][3] + dp[i - 1][j]) % m;
            dp[i][4] = dp[i - 1][3] % m;
            dp[i][5] = dp[i - 1][4] % m;
        }

        int ans = 0;
        for (int j = 0; j < 6; j++) ans = (ans + dp[n - 1][j]) % m;
        return ans;
    }
}