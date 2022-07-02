/**
 * @author Delete020
 * @since 07/02/22 23:28 PM
 */
public class MaximumScoreOfSplicedArray {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        return Math.max(help(nums1, nums2), help(nums2, nums1));
    }

    private int help(int[] nums1, int[] nums2) {
        int sum = Arrays.stream(nums1).sum();
        int max = 0;
        int[] dp = new int[nums2.length + 1];
        for (int i = 0; i < nums2.length; i++) {
            dp[i + 1] = Math.max(dp[i] + nums2[i] - nums1[i], nums2[i] - nums1[i]);
            max = Math.max(dp[i + 1], max);
        }

        return sum + max;
    }

    public int maximumsSplicedArray2(int[] nums1, int[] nums2) {
        return Math.max(help(nums1, nums2), help(nums2, nums1));
    }

    private int help(int[] nums1, int[] nums2) {
        int sum = Arrays.stream(nums1).sum();
        int max = 0;
        int dp = 0;
        for (int i = 0; i < nums2.length; i++) {
            dp = Math.max(dp, 0) + nums2[i] - nums1[i];
            max = Math.max(dp, max);
        }

        return sum + max;
    }
}