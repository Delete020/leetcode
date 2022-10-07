/**
 * @author Delete020
 * @since 10/07/22 10:31 AM
 */
public class MaximumAscendingSubarraySum {
    public int maxAscendingSum(int[] nums) {
        int pre = 0;
        int ans = 0;
        int cnt = 0;
        for (int i : nums) {
            if (i <= pre) {
                ans = Math.max(ans, cnt);
                cnt = 0;
            }
            pre = i;
            cnt += i;
        }
        return Math.max(ans, cnt);
    }
}