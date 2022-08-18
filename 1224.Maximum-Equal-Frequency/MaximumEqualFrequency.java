/**
 * @author Delete020
 * @since 08/18/22 20:27 PM
 */
public class MaximumEqualFrequency {
    public int maxEqualFreq(int[] nums) {
        int[] sum = new int[100010];
        int[] cnt = new int[100010];
        int max = 0;
        int ans = 0;
        int i = 0;
        while (i < nums.length) {
            int cur = ++cnt[nums[i]];
            sum[cur]++;
            sum[cur - 1]--;
            i++;
            if (cur > max) max = cur;
            if (max == 1) ans = i;
            if (max * sum[max] + 1 == i) ans = i;
            if ((max - 1) * (sum[max - 1] + 1) + 1 == i) ans = i;
        }
        return ans;
    }
}