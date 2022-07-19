import java.util.Arrays;

/**
 * @author Delete020
 * @since 07/19/22 21:20 PM
 */
public class CreateMaximumNumber {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[k];
        k = n1 + n2 - k;
        for (int i = 0; i <= k; i++) {
            if (i <= n1 && (k - i) <= n2) {
                int[] merge = merge(removeK(nums1, i), removeK(nums2, k - i));
                if (Arrays.compare(res, merge) < 0) {
                    res = merge;
                }
            }
        }
        return res;

    }

    private int[] removeK(int[] nums, int k) {
        int right = -1;
        int[] res = new int[nums.length];
        int end = nums.length - k;
        for (int i : nums) {
            while (right >= 0 && res[right] < i && k > 0) {
                right--;
                k--;
            }
            res[++right] = i;
        }
        return Arrays.copyOfRange(res, 0, end);
    }

    private int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (k < res.length) {
            if (compare(a, i, b, j) > 0) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }
        return res;
    }

    private int compare(int[] subsequence1, int index1, int[] subsequence2, int index2) {
        int x = subsequence1.length, y = subsequence2.length;
        while (index1 < x && index2 < y) {
            int difference = subsequence1[index1] - subsequence2[index2];
            if (difference != 0) {
                return difference;
            }
            index1++;
            index2++;
        }
        return (x - index1) - (y - index2);
    }
}