/**
 * @author Delete020
 * @since 01/28/23 13:55 PM
 */
public class WaystoMakeaFairArray {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[] odd = new int[n + 1];
        int[] even = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                odd[i + 1] = odd[i] + nums[i];
                even[i + 1] = even[i];
            } else {
                even[i + 1] = even[i] + nums[i];
                odd[i + 1] = odd[i];
            }
        }
        for (int i = 0; i < n; i++) {
            int l = odd[i + 1] + even[n] - even[i + 1];
            int r = even[i + 1] + odd[n] - odd[i + 1];
            if (i % 2 == 0 && l == r - nums[i]) ans++;
            else if (i % 2 == 1 && l - nums[i] == r) ans++;
        }
        return ans;
    }
}