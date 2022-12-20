/**
 * @author Delete020
 * @since 12/20/22 22:36 PM
 */
public class MinimumLimitofBallsinaBag {
    public int minimumSize(int[] nums, int maxOperations) {
        int r = 0, l = 1;
        for (int i : nums) r = Math.max(r, i);
        while (l < r) {
            int mid = (l + r) >> 1;
            int cnt = 0;
            for (int i : nums) cnt += (i - 1) / mid;
            if (cnt > maxOperations) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}