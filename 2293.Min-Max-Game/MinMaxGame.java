/**
 * @author Delete020
 * @since 01/15/23 09:27 AM
 */
public class MinMaxGame {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while (n != 1) {
            for (int i = 0; i < n / 2; i++) {
                if (i % 2 == 0) nums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                else nums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
            n /= 2;
        }
        return nums[0];
    }
}