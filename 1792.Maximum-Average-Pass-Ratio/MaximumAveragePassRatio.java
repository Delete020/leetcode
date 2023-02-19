import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author Delete020
 * @since 02/19/23 11:22 AM
 */
public class MaximumAveragePassRatio {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        double average = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double a1 = (a[0] + 1.0) / (a[1] + 1.0) - (a[0] + 0.0) / a[1];
            double a2 = (b[0] + 1.0) / (b[1] + 1.0) - (b[0] + 0.0) / b[1];
            return Double.compare(a1, a2) > 0 ? -1 : 1;
        });
        Collections.addAll(pq, classes);
        while (extraStudents > 0) {
            int[] cur = pq.poll();
            cur[0]++;
            cur[1]++;
            pq.add(cur);
            extraStudents--;
        }
        for (int[] v : pq) average += (v[0] + 0.0) / v[1];
        return average / classes.length;
    }
}