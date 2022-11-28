import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 11/28/22 23:10 PM
 */
public class LargestSumofAverages {
    double[] sum;
    int n;
    Map<String, Double> memo;

    public double largestSumOfAverages(int[] nums, int k) {
        n = nums.length;
        memo = new HashMap<>();
        sum = new double[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = nums[i] + sum[i];
        }
        if (n == k) return sum[n];
        return dp(0, k);
    }

    private double dp(int index, int residue) {
        if (residue == 1) return (sum[n] - sum[index]) / (n - index);
        String key = index + " " + residue;
        if (memo.containsKey(key)) return memo.get(key);
        double max = 0;
        int cnt = 1;
        for (int i = index + 1; i <= n - residue + 1; i++, cnt++) {
            max = Double.max(max, dp(i, residue - 1) + (sum[i] - sum[index]) / cnt);
        }
        memo.put(key, max);
        return max;
    }
}