import java.util.Arrays;

/**
 * @author Delete020
 * @since 6/15/22 4:35 PM
 */
public class FindKthSmallestPairDistance {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int size = nums.length;
        int left = 0;
        int right = 1111111;

        while (left < right) {
            int mid = (left + right) >> 1;
            int count = 0;
            for (int i = 0, j = 0; i < size; i++) {
                while (j < size && nums[j] - nums[i] <= mid) {
                    j++;
                }
                count += j - i - 1;
            }

            if (count >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
