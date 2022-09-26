/**
 * @author Delete020
 * @since 09/26/22 21:32 PM
 */
public class MissingTwo {
    public int[] missingTwo(int[] nums) {
        int n = nums.length;
        boolean max1 = false;
        boolean max2 = false;
        for (int num : nums) {
            int i = Math.abs(num);
            if (i > n || i < 0) {
                if (i == n + 1) max1 = true;
                else if (i == n + 2) max2 = true;
            } else {
                nums[i - 1] = -nums[i - 1];
            }
        }

        int[] ans = new int[2];
        int j = 0;
        for (int i = 0; i < n && j < 2; i++) {
            if (nums[i] > 0) {
                ans[j++] = i + 1;
            }
        }

        if (j == 0) {
            ans[0] = ++n;
            ans[1] = ++n;
        } else if (j == 1) {
            if (!max1) ans[1] = n + 1;
            else ans[1] = n + 2;
        }

        return ans;
    }
}