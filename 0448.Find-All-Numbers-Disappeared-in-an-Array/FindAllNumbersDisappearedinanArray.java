import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 08/10/22 21:05 PM
 */
public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[(nums[i] - 1) % n] += n;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] - n <= 0) {
                res.add(i + 1);
            }
        }

        return res;
    }
}