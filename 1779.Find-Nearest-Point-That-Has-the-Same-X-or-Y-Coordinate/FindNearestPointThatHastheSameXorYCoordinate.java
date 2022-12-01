/**
 * @author Delete020
 * @since 12/01/22 17:04 PM
 */
public class FindNearestPointThatHastheSameXorYCoordinate {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = -1;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] != x && points[i][1] != y) continue;
            int dist = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
            if (dist < max) {
                max = dist;
                ans = i;
            }
        }
        return ans;
    }
}