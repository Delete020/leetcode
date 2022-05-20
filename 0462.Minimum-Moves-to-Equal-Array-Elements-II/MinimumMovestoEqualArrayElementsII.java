import java.util.Arrays;

/**
 * @author Delete020
 * @since 5/20/22 10:50 PM
 */
public class MinimumMovestoEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, t = nums[(n - 1) / 2], ans = 0;
        for (int i : nums) {
            ans += Math.abs(t - i);
        }
        return ans;
    }
}
