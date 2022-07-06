/**
 * @author Delete020
 * @since 07/06/22 22:21 PM
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int rigth = 0;

        while (rigth < nums.length) {
            if (nums[left] != nums[rigth]) {
                left++;
                nums[left] = nums[rigth];
            }
            rigth++;
        }

        return left + 1;
    }
}