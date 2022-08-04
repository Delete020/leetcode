import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Delete020
 * @since 08/04/22 20:19 PM
 */
public class MinimumSubsequenceinNonIncreasingOrder {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int sum = IntStream.of(nums).sum() / 2;
        int index = nums.length - 1;
        int minSum = 0;

        while (minSum <= sum) {
            res.add(nums[index]);
            minSum += nums[index--];
        }

        return res;
    }
}