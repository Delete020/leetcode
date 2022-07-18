import java.util.Arrays;

/**
 * @author Delete020
 * @since 07/18/22 21:10 PM
 */
public class AdvantageShuffle {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] res = new int[n];
        int[][] sort2 = new int[n][2];
        for (int i = 0; i < n; i++) {
            sort2[i] = new int[]{nums2[i], i};
        }

        Arrays.sort(nums1);
        Arrays.sort(sort2, (a, b) -> b[0] - a[0]);

        int left = 0;
        int right = n - 1;
        for (int[] sort : sort2) {
            if (sort[0] < nums1[right]) {
                res[sort[1]] = nums1[right--];
            } else {
                res[sort[1]] = nums1[left++];
            }
        }

        return res;
    }
}