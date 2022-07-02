/**
 * @author Delete020
 * @since 07/02/22 22:25 PM
 */
public class CountNumberofWaystoPlaceHouses {
    public int countHousePlacements(int n) {
        int mod = (int) 1e9 + 7;
        long[][] dp = new long[10005][2];
        dp[1][0] = 1;
        dp[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % mod;
            dp[i][1] = dp[i - 1][0];
        }
        long res = (dp[n][0] + dp[n][1]) % mod;
        return (int) (res * res % mod);
    }
}