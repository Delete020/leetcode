/**
 * @author Delete020
 * @since 09/20/22 23:57 PM
 */
public class PartitiontoKEqualSumSubsets {
    int[] nums;

    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (k == 1) return true;
        int sum = Arrays.stream(nums).sum();
        int average = sum / k;
        if (average * k != sum) return false;

        Arrays.sort(nums);
        this.nums = nums;
        if (nums[nums.length - 1] > average) return false;

        int[] bucket = new int[k];
        Arrays.fill(bucket, average);
        return dfs(bucket, nums.length - 1, k);
    }

    private boolean dfs(int[] bucket, int index, int k) {
        if (index < 0) return true;
        for (int i = 0; i < k; i++) {
            if (i != 0 && bucket[i] == bucket[i - 1]) continue;
            if (bucket[i] == nums[index] || bucket[i] - nums[index] >= nums[0]) {
                bucket[i] -= nums[index];
                if (dfs(bucket, index - 1, k)) {
                    return true;
                }
                bucket[i] += nums[index];
            }
        }
        return false;
    }
}