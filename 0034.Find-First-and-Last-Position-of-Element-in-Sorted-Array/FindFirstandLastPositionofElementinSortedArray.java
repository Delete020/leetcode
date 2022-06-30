/**
 * @author Delete020
 * @since 6/30/22 9:42 PM
 */
public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return new int[]{-1, -1};
        }

        int left = 0;
        int right = n;
        while (left < right) {
            int mid = (left + right) >> 1;
            int num = nums[mid];
            if (num >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        if (left >= n || nums[left] != target) {
            return new int[]{-1, -1};
        }

        int r = left;
        while (++r < n && nums[r] == target) {
        }

        return new int[]{left, --r};
    }
}
