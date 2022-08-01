import java.util.HashSet;
import java.util.Set;

/**
 * @author Delete020
 * @since 08/01/22 21:23 PM
 */
public class MakeArrayZerobySubtractingEqualAmounts {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (int i : nums) {
            set.add(i);
        }
        return set.size() - 1;
    }
}