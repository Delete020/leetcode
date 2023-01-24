/**
 * @author Delete020
 * @since 01/24/23 11:18 AM
 */
public class QueriesonNumberofPointsInsideaCircle {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int r = queries[i][2];
            for (int[] point : points) {
                int x = a - point[0];
                int y = b - point[1];
                ans[i] += (x * x + y * y <= r * r) ? 1 : 0;
            }
        }
        return ans;
    }
}