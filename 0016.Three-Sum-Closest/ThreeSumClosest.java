import java.util.Arrays;

/**
 * @author Delete020
 * @since 08/28/22 16:49 PM
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int sum = nums[i] + twoSum(nums, i + 1, target - nums[i]);
            if (Math.abs(ans) > Math.abs(target - sum)) {
                ans = target - sum;
            }
        }
        return target - ans;
    }

    private int twoSum(int[] nums, int left, int target) {
        int right = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (Math.abs(ans) > Math.abs(target - sum)) {
                ans = target - sum;
            }
            if (sum >= target) {
                right--;
            } else {
                left++;
            }
        }
        return target - ans;
    }
}