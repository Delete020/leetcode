/**
 * @author Delete020
 * @since 10/10/22 21:45 PM
 */
public class MinimumSwapsToMakeSequencesIncreasing {
    public int minSwap(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] change = new int[n];
        int[] unchange = new int[n];
        change[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums1[i] > nums1[i - 1] && nums2[i] > nums2[i - 1]) {
                if (nums1[i] > nums2[i - 1] && nums2[i] > nums1[i - 1]) {
                    unchange[i] = Math.min(change[i - 1], unchange[i - 1]);
                    change[i] = unchange[i] + 1;
                } else {
                    change[i] = change[i - 1] + 1;
                    unchange[i] = unchange[i - 1];
                }
            } else {
                change[i] = unchange[i - 1] + 1;
                unchange[i] = change[i - 1];
            }

        }

        return Math.min(change[n - 1], unchange[n - 1]);
    }
}