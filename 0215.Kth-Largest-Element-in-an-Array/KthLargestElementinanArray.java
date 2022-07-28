/**
 * @author Delete020
 * @since 07/28/22 22:01 PM
 */
public class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        quicklySort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }

    public void quicklySort(int[] nums, int l, int r) {
        int i = l - 1;
        int j = r + 1;
        int x = nums[l];
        if (l >= r) {
            return;
        }
        while (i < j) {
            do {
                i++;
            } while (nums[i] < x);
            do {
                j--;
            } while (nums[j] > x);
            if (i < j) {
                int tem = nums[i];
                nums[i] = nums[j];
                nums[j] = tem;
            }
        }
        quicklySort(nums, l, j);
        quicklySort(nums, j + 1, r);
    }
}