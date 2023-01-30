import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 01/30/23 20:12 PM
 */
public class AllPathsFromSourcetoTarget {
    List<List<Integer>> ans;
    int n;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        n = graph.length - 1;
        path.add(0);
        for (int i : graph[0]) dfs(graph, i, path);
        return ans;
    }

    private void dfs(int[][] graph, int index, List<Integer> path) {
        path.add(index);
        if (index == n) ans.add(new ArrayList<>(path));
        for (int i : graph[index]) dfs(graph, i, path);
        path.remove(path.size() - 1);
    }
}