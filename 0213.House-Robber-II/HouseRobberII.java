/**
 * @author Delete020
 * @since 08/22/22 20:42 PM
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        int[] dp = new int[n + 2];
        int[] dp2 = new int[n + 2];
        for (int i = 0; i < n; i++) {
            dp[i + 2] = Math.max(dp[i + 1], dp[i] + nums[i]);
            dp2[i + 2] = Math.max(dp2[i + 1], dp2[i] + nums[i]);
            if (i == 0) dp2[i + 2] = 0;
        }
        return Math.max(dp2[n + 1], dp[n]);
    }
}
}