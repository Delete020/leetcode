/**
 * @author Delete020
 * @since 08/16/22 20:23 PM
 */
public class RotateFunction {
    public int maxRotateFunction(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int j = 0;
        int mul = 0;
        int sum = 0;
        for (int num : nums) {
            mul += num * j++;
            sum += num;
        }

        for (int i = n - 1; i >= 0; i--) {
            mul = mul - nums[i] * n + sum;
            max = Math.max(mul, max);
        }

        return max;
    }
}