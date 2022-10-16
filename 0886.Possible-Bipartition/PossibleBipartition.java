import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Delete020
 * @since 10/16/22 16:54 PM
 */
public class PossibleBipartition {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<Integer>[] map = new ArrayList[n + 2];
        for (int i = 0; i <= n + 1; i++) map[i] = new ArrayList<>();
        for (int[] pair : dislikes) {
            map[pair[0]].add(pair[1]);
            map[pair[1]].add(pair[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> empty = new ArrayList<>();
        int[] color = new int[n + 2];
        boolean f = true;
        int cnt = 1;
        while (!queue.isEmpty() || cnt <= n) {
            if (queue.isEmpty()) {
                while (cnt <= n && color[cnt] != 0) {
                    cnt++;
                }
                queue.offer(cnt);
            }
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                color[current] = f ? 1 : -1;
                for (int opposite : map[current]) {
                    if (f && color[opposite] != 1) {
                        color[opposite] = -1;
                    } else if (!f && color[opposite] != -1) {
                        color[opposite] = 1;
                    } else {
                        return false;
                    }
                    queue.add(opposite);
                    color[opposite] = f ? -1 : 1;
                }
                map[current] = empty;
            }
            f = !f;
        }
        return true;
    }
}