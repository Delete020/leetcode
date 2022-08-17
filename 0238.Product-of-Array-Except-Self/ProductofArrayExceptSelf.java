import java.util.Arrays;

/**
 * @author Delete020
 * @since 08/17/22 21:39 PM
 */
public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);

        for (int i = 0; i < n; i++) {
            res[i] *= left;
            left *= nums[i];

            res[n - i - 1] *= right;
            right *= nums[n - i - 1];
        }
        return res;
    }
}