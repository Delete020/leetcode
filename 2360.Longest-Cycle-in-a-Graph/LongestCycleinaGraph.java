import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 08/01/22 21:43 PM
 */
public class LongestCycleinaGraph {
    public int longestCycle(int[] edges) {
        boolean[] visited = new boolean[edges.length];
        int max = -1;
        for (int i = 0; i < edges.length; i++) {
            if (!visited[i]) max = Math.max(max, dfs(edges, visited, i));
        }
        return max;
    }

    private int dfs(int[] edges, boolean[] visited, int start) {
        int max = -1;
        int distance = 1;
        Map<Integer, Integer> map = new HashMap<>();

        while (start != -1) {
            if (visited[start]) {
                if (!map.containsKey(start)) return -1;
                return distance - map.get(start);
            }
            visited[start] = true;
            map.put(start, distance++);
            start = edges[start];
        }

        return max;
    }
}