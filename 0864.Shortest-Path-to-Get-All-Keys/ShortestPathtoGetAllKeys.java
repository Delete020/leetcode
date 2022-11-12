import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Delete020
 * @since 11/10/22 23:07 PM
 */
public class ShortestPathtoGetAllKeys {
    public int shortestPathAllKeys(String[] grid) {
        int m = grid.length;
        int n = grid[0].length();
        int cnt = 0;
        int[] dir = new int[]{-1, 0, 1, 0, -1};
        int[][][] pi = new int[35][35][1 << 10];

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i].charAt(j) == '@') {
                    queue.add(new int[]{i, j, 0});
                } else if (Character.isLowerCase(grid[i].charAt(j))) {
                    cnt++;
                }
            }
        }

        int allKey = (1 << cnt) - 1;
        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int x = queue.peek()[0];
                int y = queue.peek()[1];
                int curkey = queue.poll()[2];
                if (curkey == allKey) return step;
                for (int j = 1; j < 5; j++) {
                    int a = x + dir[j - 1];
                    int b = y + dir[j];
                    if (a < 0 || a >= m || b < 0 || b >= n) continue;
                    char c = grid[a].charAt(b);
                    if (c == '#') continue;
                    if (Character.isUpperCase(c) && ((curkey >> (c - 'A') & 1) == 0)) continue;
                    int key = curkey;
                    if (Character.isLowerCase(c)) {
                        key |= 1 << (c - 'a');
                    }
                    if (pi[a][b][key] == 1) continue;
                    pi[a][b][key] = 1;
                    queue.offer(new int[]{a, b, key});
                }
            }
            step++;
        }
        return -1;
    }
}

