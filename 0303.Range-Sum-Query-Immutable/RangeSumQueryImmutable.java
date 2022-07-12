/**
 * @author Delete020
 * @since 07/12/22 21:21 PM
 */
public class RangeSumQueryImmutable {
    class NumArray {
        int preNums[];

        public NumArray(int[] nums) {
            preNums = new int[nums.length + 1];
            for (int i = 1; i < preNums.length; i++) {
                preNums[i] = preNums[i - 1] + nums[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            return preNums[right + 1] - preNums[left];
        }
    }
}