/**
 * @author Delete020
 * @since 08/09/22 21:39 PM
 */
public class MinimumValuetoGetPositiveStepbyStepSum {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int res = 0;
        for (int num : nums) {
            sum += num;
            if (sum < 1) {
                res += 1 - sum;
                sum = 1;
            }
        }
        return res == 0 ? 1 : res;
    }
}