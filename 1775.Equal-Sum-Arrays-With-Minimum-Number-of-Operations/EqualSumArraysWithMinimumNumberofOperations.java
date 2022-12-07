/**
 * @author Delete020
 * @since 12/07/22 21:49 PM
 */
public class EqualSumArraysWithMinimumNumberofOperations {
    public int minOperations(int[] nums1, int[] nums2) {
        if (6 * nums1.length < nums2.length || 6 * nums2.length < nums1.length)
            return -1;
        int[] cnt = new int[6];
        int d = 0;
        for (int i : nums1) d += i;
        for (int i : nums2) d -= i;
        if (d < 0) {
            d = -d;
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        for (int i : nums1) cnt[i - 1]++;
        for (int i : nums2) cnt[6 - i]++;
        for (int i = 5, ans = 0; ;i--) {
            if (i * cnt[i] >= d) return ans + (d + i - 1) / i;
            ans += cnt[i];
            d -= cnt[i] * i;
        }
    }
}