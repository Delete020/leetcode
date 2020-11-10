import java.lang.reflect.Array;

public class sol {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i = i - 1;
        }

        if (i >= 0) {
            int j = closest(nums, i + 1);
            swap(nums, i, j);
        }

        sort(nums, i + 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int closest(int[] nums, int i) {
        int pivot = nums[i - 1];
        int result = i;
        for (int j = i; j < nums.length; j++) {
            if (nums[j] > pivot && nums[j] <= nums[result]) {
                result = j;
            }
        }
        return result;
    }

    private void sort(int[] nums, int i) {
        int j = i;
        int k = nums.length - 1;
        while (j < k) {
            swap(nums, j, k);
            j++;
            k--;
        }
    }
}
