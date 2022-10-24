/**
 * @author Delete020
 * @since 10/24/22 22:47 PM
 */
public class PartitionArrayintoDisjointIntervals {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int leftMax = nums[0];
        int max = nums[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < leftMax) {
                leftMax = max;
                index = i;
            }
        }
        return index + 1;
    }
}