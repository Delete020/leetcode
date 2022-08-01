import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 08/01/22 21:24 PM
 */
public class FindClosestNodetoGivenTwoNodes {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        Map<Integer, Integer> node1Map = dfs(edges, node1);
        Map<Integer, Integer> node2Map = dfs(edges, node2);

        int cnt = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;

        for (int node : node1Map.keySet()) {
            if (node2Map.containsKey(node)) {
                int max = Math.max(node1Map.get(node), node2Map.get(node));
                if (max < cnt) {
                    res = node;
                    cnt = max;
                } else if (max == cnt) {
                    res = Math.min(res, node);
                }
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private Map<Integer, Integer> dfs(int[] edges, int node) {
        int distance = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = node; i != -1; ) {
            if (map.containsKey(i)) break;
            map.put(i, distance++);
            i = edges[i];
        }
        return map;
    }
}