/**
 * @author Delete020
 * @since 11/24/22 22:00 PM
 */
public class NumberofSubarrayswithBoundedMaximum {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans = 0;
        int pre = 0;
        int j = nums.length;
        for (int i = j - 1; i >= 0; i--) {
            if (nums[i] > right) j = i;
            if (nums[i] >= left) pre = j - i;
            ans += pre;
        }
        return ans;
    }
}