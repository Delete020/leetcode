import java.util.HashSet;
import java.util.Set;

/**
 * @author Delete020
 * @since 03/26/23 09:46 AM
 */
public class FindSubarraysWithEqualSum {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            if (set.contains(nums[i] + nums[i - 1])) return true;
            set.add(nums[i] + nums[i - 1]);
        }
        return false;
    }
}