/**
 * @author Delete020
 * @since 11/16/22 21:38 PM
 */
public class GlobalandLocalInversions {
    public boolean isIdealPermutation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i && Math.abs(nums[i] - i) > 1) return false;
        }
        return true;
    }
}