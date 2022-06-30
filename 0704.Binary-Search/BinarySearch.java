/**
 * @author Delete020
 * @since 6/30/22 9:37 PM
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = (left + right) >> 1;
            int num = nums[mid];

            if (num == target) {
                return mid;
            } else if (num < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return -1;
    }
}
