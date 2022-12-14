import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Delete020
 * @since 12/14/22 23:24 PM
 */
public class CheckingExistenceofEdgeLengthLimitedPaths {
    int[] uf;

    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        int m = edgeList.length;
        int o = queries.length;
        boolean[] ans = new boolean[o];
        uf = new int[n + 10];
        for (int i = 0; i < n; i++) uf[i] = i;
        for (int i = 0; i < o; i++) queries[i] = new int[]{i, queries[i][0], queries[i][1], queries[i][2]};
        Arrays.sort(edgeList, Comparator.comparingInt(a -> a[2]));
        Arrays.sort(queries, Comparator.comparingInt(a -> a[3]));
        int i = 0;
        for (int[] querie : queries) {
            while (i < m && edgeList[i][2] < querie[3]) {
                union(edgeList[i][0], edgeList[i++][1]);
            }
            ans[querie[0]] = find(querie[1]) == find(querie[2]);
        }
        return ans;
    }

    private void union(int a, int b) {
        uf[find(a)] = find(b);
    }

    private int find(int a) {
        return uf[a] == a ? a : (uf[a] = find(uf[a]));
    }
}