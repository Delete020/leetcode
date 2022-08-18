/**
 * @author Delete020
 * @since 08/18/22 20:25 PM
 */
public class JumpGameII {
    public int jump(int[] nums) {
        if (nums.length <= 1) return 0;
        return dfs(nums, 0, 0, nums.length - 1);
    }

    private int dfs(int[] nums, int i, int cnt, int step) {
        if (nums[i] >= step) return cnt + 1;
        int max = Integer.MIN_VALUE;
        int index = i;
        for (int j = 1; j <= nums[i] && j < nums.length; j++) {
            if (j + nums[i + j] > max) {
                max = j + nums[i + j];
                index = j;
            }
        }
        return dfs(nums, i + index, cnt + 1, step - index);
    }
}