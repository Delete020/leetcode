/**
 * @author Delete020
 * @since 07/18/22 21:08 PM
 */
public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int m) {
        int left = 0;
        int right = 1;
        for (int i : nums) {
            left = Math.max(left, i);
            right += i;
        }

        while (left < right) {
            int mid = (left + right) >> 1;
            if (getCnt(nums, mid) <= m) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int getCnt(int[] nums, int x) {
        int res = 0;
        for (int i = 0; i < nums.length; ) {
            int cap = x;
            while (i < nums.length) {
                if (nums[i] > cap) {
                    break;
                }
                cap -= nums[i++];
            }
            res++;
        }
        return res;
    }
}