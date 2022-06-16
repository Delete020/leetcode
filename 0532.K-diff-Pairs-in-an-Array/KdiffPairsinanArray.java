import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Delete020
 * @since 6/16/22 5:12 PM
 */
public class KdiffPairsinanArray {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int length = nums.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0, j = 0; i < length; i++) {
            while (j < length && nums[j] - nums[i] < k) {
                j++;
            }
            if (j < length && i != j && nums[j] - nums[i] == k) {
                set.add(nums[i]);
            }
        }

        return set.size();
    }
}
