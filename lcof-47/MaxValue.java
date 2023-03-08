/**
 * @author Delete020
 * @since 03/08/23 21:54 PM
 */
public class MaxValue {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i + 1][j + 1] = grid[i][j] + Math.max(ans[i + 1][j], ans[i][j + 1]);
            }
        }
        return ans[m][n];
    }
}