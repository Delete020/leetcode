/**
 * @author Delete020
 * @since 6/25/22 6:36 PM
 */
public class PaintHouse {
    public int minCost(int[][] costs) {
        int i;
        for (i = 1; i < costs.length; i++) {
            costs[i][0] += Math.min(costs[i - 1][1], costs[i - 1][2]);
            costs[i][1] += Math.min(costs[i - 1][0], costs[i - 1][2]);
            costs[i][2] += Math.min(costs[i - 1][0], costs[i - 1][1]);
        }
        i--;
        return Math.min(costs[i][0], Math.min(costs[i][1], costs[i][2]));
    }
}
