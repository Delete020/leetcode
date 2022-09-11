/**
 * @author Delete020
 * @since 09/11/22 23:15 PM
 */
public class MinimumCosttoHireKWorkers {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = wage.length;
        double[][] priceRatio = new double[n][2];
        for (int i = 0; i < n; i++) {
            priceRatio[i] = new double[]{wage[i] * 1.0 / quality[i], i};
        }
        Arrays.sort(priceRatio, (a, b) -> Double.compare(a[0], b[0]));

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        int sum = 0;
        double ans = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int cur = quality[(int) priceRatio[i][1]];
            sum += cur;
            queue.add(cur);
            if (queue.size() > k) sum -= queue.poll();
            if (queue.size() == k) ans = Math.min(ans, sum * priceRatio[i][0]);
        }

        return ans;
    }
}