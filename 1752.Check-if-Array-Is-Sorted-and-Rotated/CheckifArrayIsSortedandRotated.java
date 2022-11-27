/**
 * @author Delete020
 * @since 11/27/22 14:19 PM
 */
public class CheckifArrayIsSortedandRotated {
    public boolean check(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                cnt++;
            }
        }
        return cnt <= 1;
    }
}