/**
 * @author Delete020
 * @since 08/19/22 22:12 PM
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length < 2) return true;
        int maxPos = 0;
        int end = 0;
        for (int i = 0; i < nums.length && maxPos < nums.length - 1; i++) {
            maxPos = Math.max(nums[i] + i, maxPos);
            if (i == end) {
                if (end == maxPos) {
                    return false;
                }
                end = maxPos;
            }
        }
        return true;
    }
}