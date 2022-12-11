/**
 * @author Delete020
 * @since 12/11/22 13:10 PM
 */
public class MinimumOperationstoMaketheArrayIncreasing {
    public int minOperations(int[] nums) {
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                ans += nums[i - 1] + 1 - nums[i];
                nums[i] = nums[i - 1] + 1;
            }
        }
        return ans;
    }
}