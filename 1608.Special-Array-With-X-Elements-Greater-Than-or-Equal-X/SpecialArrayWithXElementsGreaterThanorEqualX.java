import java.util.Arrays;

/**
 * @author Delete020
 * @since 09/12/22 19:23 PM
 */
public class SpecialArrayWithXElementsGreaterThanorEqualX {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int r = n;
        int l = 0;
        Arrays.sort(nums);
        while (l < r) {
            int mid = (r + l) >> 1;
            if (nums[mid] < n - mid) {
                l = mid + 1;
            } else {
                if (mid > 0 && nums[mid - 1] >= n - mid) {
                    r = mid;
                } else {
                    return n - mid;
                }
            }
        }
        return -1;
    }
}