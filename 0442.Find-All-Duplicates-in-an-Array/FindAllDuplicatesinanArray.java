import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 08/10/22 21:04 PM
 */
public class FindAllDuplicatesinanArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int x = Math.abs(nums[i]) - 1;
            if (nums[x] > 0) {
                nums[x] *= -1;
            } else {
                res.add(x + 1);
            }
        }

        return res;
    }
}