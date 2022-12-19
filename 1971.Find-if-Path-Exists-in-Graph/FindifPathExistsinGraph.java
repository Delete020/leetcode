/**
 * @author Delete020
 * @since 12/19/22 21:02 PM
 */
public class FindifPathExistsinGraph {
    int[] group;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        group = new int[n];
        for (int i = 0; i < n; i++) group[i] = i;
        for (int[] edge : edges) union(edge[0], edge[1]);
        return find(source) == find(destination);
    }

    private void union(int a, int b) {
        group[find(a)] = find(b);
    }

    private int find(int a) {
        return a == group[a] ? a : (group[a] = find(group[a]));
    }
}