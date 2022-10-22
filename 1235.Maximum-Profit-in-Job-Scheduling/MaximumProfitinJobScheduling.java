import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Delete020
 * @since 10/22/22 22:24 PM
 */
public class MaximumProfitinJobScheduling {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = endTime.length;
        int[][] jobs = new int[n + 1][3];
        for (int i = 0; i < n; i++) {
            jobs[i + 1] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[1]));
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        int max = 0;
        for (int i = 0; i <= n; i++) {
            Map.Entry<Integer, Integer> entry = dp.floorEntry(jobs[i][0]);
            int cur = jobs[i][2] + entry.getValue();
            if (cur > max) {
                dp.put(jobs[i][1], cur);
                max = cur;
            }
        }
        return max;
    }
}