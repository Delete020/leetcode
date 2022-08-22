import java.util.Arrays;

/**
 * @author Delete020
 * @since 08/22/22 20:46 PM
 */
public class CoinChange {
    int[] dp = new int[10001];

    {
        Arrays.fill(dp, -11);
    }

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        if (dp[amount] != -11) return dp[amount];

        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
            int sub = coinChange(coins, amount - coin);
            if (sub == -1) continue;
            ans = Math.min(sub + 1, ans);
        }

        return dp[amount] = ans == Integer.MAX_VALUE ? -1 : ans;
    }
}