/**
 * @author Delete020
 * @since 08/26/22 21:32 PM
 */
public class MaximumProductofTwoElementsinanArray {
    public int maxProduct(int[] nums) {
        int i = 0;
        int j = 0;
        for (int num : nums) {
            if (num > i) {
                j = i;
                i = num;
            } else if (j < num) {
                j = num;
            }
        }
        return (i - 1) * (j - 1);
    }
}