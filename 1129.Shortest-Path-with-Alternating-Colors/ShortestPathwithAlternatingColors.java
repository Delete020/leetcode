import java.util.*;

/**
 * @author Delete020
 * @since 02/02/23 21:29 PM
 */
public class ShortestPathwithAlternatingColors {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[] ans = new int[n];
        List<Integer>[] redMap = new ArrayList[n];
        List<Integer>[] blueMap = new ArrayList[n];
        Arrays.fill(ans, -1);
        ans[0] = 0;
        for (int i = 0; i < n; i++) redMap[i] = new ArrayList<>();
        for (int i = 0; i < n; i++) blueMap[i] = new ArrayList<>();
        for (int[] i : redEdges) redMap[i[0]].add(i[1]);
        for (int[] i : blueEdges) blueMap[i[0]].add(i[1]);
        bfs(redMap, blueMap, ans, n);
        bfs(blueMap, redMap, ans, n);
        return ans;
    }

    private void bfs(List<Integer>[] redMap, List<Integer>[] blueMap, int[] ans, int n) {
        Queue<Integer> queue = new LinkedList<>(redMap[0]);
        boolean[] redVisited = new boolean[n];
        boolean[] blueVisited = new boolean[n];
        redVisited[0] = true;
        int layer = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer>[] map = layer % 2 == 1 ? blueMap : redMap;
            boolean[] visited = layer % 2 == 1 ? blueVisited : redVisited;
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                if (ans[cur] == -1 || ans[cur] > layer) ans[cur] = layer;
                for (int j : map[cur]) {
                    if (!visited[j]) queue.offer(j);
                    visited[j] = true;
                }
            }
            layer++;
        }
    }
}