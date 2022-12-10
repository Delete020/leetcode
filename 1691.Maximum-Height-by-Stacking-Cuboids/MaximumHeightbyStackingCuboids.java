import java.util.Arrays;

/**
 * @author Delete020
 * @since 12/10/22 15:27 PM
 */
public class MaximumHeightbyStackingCuboids {
    public int maxHeight(int[][] cuboids) {
        for (int[] cuboid : cuboids) Arrays.sort(cuboid);
        Arrays.sort(cuboids, (a, b) -> a[0] == b[0] ? (a[1] == b[1] ? b[2] - a[2] : b[1] - a[1]) : b[0] - a[0]);
        int n = cuboids.length;
        int[] dp = new int[n + 1];
        int ans = cuboids[0][2];
        for (int i = 0; i < cuboids.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (cuboids[j][0] >= cuboids[i][0] && cuboids[j][1] >= cuboids[i][1] && cuboids[j][2] >= cuboids[i][2]) {
                    max = Math.max(dp[j], max);
                }
            }
            dp[i] = max + cuboids[i][2];
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}