import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Delete020
 * @since 09/18/22 14:19 PM
 */
public class MakingALargeIsland {
    int[][] grid;
    int no = 1;
    int size = 0;
    int[] dirs = new int[]{-1, 0, 1, 0, -1};
    int n = 0;

    public int largestIsland(int[][] grid) {
        this.grid = grid;
        n = grid.length;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    no++;
                    size = 0;
                    dfs(i, j);
                    map.put(no, size);
                    ans = Math.max(size, ans);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    int cnt = 1;
                    Set<Integer> vis = new HashSet<>();
                    for (int k = 0; k < 4; k++) {
                        int x = i + dirs[k];
                        int y = j + dirs[k + 1];
                        if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] != 0 && !vis.contains(grid[x][y])) {
                            cnt += map.get(grid[x][y]);
                            vis.add(grid[x][y]);
                        }
                    }
                    ans = Math.max(cnt, ans);
                }
            }
        }

        return ans;
    }

    private void dfs(int i, int j) {
        grid[i][j] = no;
        size++;
        for (int k = 0; k < 4; k++) {
            int x = i + dirs[k];
            int y = j + dirs[k + 1];
            if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] == 1) {
                dfs(x, y);
            }
        }
    }
}