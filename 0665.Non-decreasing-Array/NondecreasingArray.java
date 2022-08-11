/**
 * @author Delete020
 * @since 08/11/22 21:06 PM
 */
public class NondecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int pre = Integer.MIN_VALUE;
        int f = 0;
        for (int i = 0; i < nums.length; i++) {
            if (pre > nums[i]) {
                if (++f == 2) return false;
                if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                    nums[i] = pre;
                }
            }
            pre = nums[i];
        }

        return true;
    }
}