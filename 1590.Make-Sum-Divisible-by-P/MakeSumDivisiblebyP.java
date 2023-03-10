import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 03/10/23 22:58 PM
 */
public class MakeSumDivisiblebyP {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long[] sum = new long[n + 1];
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i] % p;
        }
        if (sum[n] % p == 0) return 0;
        int ans = n;
        long min = sum[n] % p;
        map.put(0L, 0);
        for (int i = 1; i <= n; i++) {
            map.put(sum[i] % p, i);
            int j = map.getOrDefault((sum[i] - min + p) % p, -n);
            ans = Math.min(ans, i - j);
        }
        return ans == n ? -1 : ans;
    }
}