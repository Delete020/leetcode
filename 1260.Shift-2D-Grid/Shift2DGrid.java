import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Delete020
 * @since 07/20/22 23:07 PM
 */
public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] g = new int[m][n];

        for (int i = 0; i < n; i++) {
            int col = (k + i) % n;
            int row = ((k + i) / n) % m;

            for (int[] ints : grid) {
                g[row++ % m][col] = ints[i];
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            res.add(Arrays.stream(g[i]).boxed().toList());
        }
        return res;
    }
}