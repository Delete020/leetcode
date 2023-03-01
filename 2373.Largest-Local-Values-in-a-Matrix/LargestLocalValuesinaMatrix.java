/**
 * @author Delete020
 * @since 03/01/23 22:52 PM
 */
public class LargestLocalValuesinaMatrix {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n - 2][n - 2];
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int max = 0;
                for (int x = i - 1; x < i + 2; x++) {
                    for (int y = j - 1; y < j + 2; y++) {
                        max = Math.max(max, grid[x][y]);
                    }
                }
                ans[i - 1][j - 1] = max;
            }
        }
        return ans;
    }
}