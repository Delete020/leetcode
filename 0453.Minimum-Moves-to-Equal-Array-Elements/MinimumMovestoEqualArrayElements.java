import java.util.Arrays;

/**
 * @author Delete020
 * @since 08/11/22 21:04 PM
 */
public class MinimumMovestoEqualArrayElements {
    public int minMoves(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int res = 0;
        for (int num : nums) {
            res += num - min;
        }
        return res;
    }
}