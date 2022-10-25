import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Delete020
 * @since 10/25/22 22:32 PM
 */
public class ShortestBridge {
    int[] move = new int[]{-1, 0, 1, 0, -1};
    int step = 5;
    int n;

    public int shortestBridge(int[][] grid) {
        n = grid.length;
        Queue<int[]> queue = new LinkedList<>();
        boolean f = true;
        for (int i = 0; i < n && f; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, queue);
                    f = false;
                    break;
                }
            }
        }

        int ans = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] coords = queue.poll();
                for (int k = 1; k < step; k++) {
                    int x = coords[0] + move[k - 1], y = coords[1] + move[k];
                    if (x >= 0 && x < n && y >= 0 && y < n) {
                        if (grid[x][y] == 1) return ans;
                        if (grid[x][y] == 0) {
                            queue.offer(new int[]{x, y});
                            grid[x][y] = -1;
                        }
                    }
                }
            }
            ans++;
        }
        return ans;
    }

    private void dfs(int[][] grid, int i, int j, Queue<int[]> queue) {
        if (grid[i][j] == 0) {
            queue.offer(new int[]{i, j});
            grid[i][j] = -1;
            return;
        }
        grid[i][j] = 2;
        for (int k = 1; k < step; k++) {
            int x = i + move[k - 1], y = j + move[k];
            if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] != 2 && grid[x][y] != -1) {
                dfs(grid, x, y, queue);
            }
        }
    }
}