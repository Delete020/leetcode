/**
 * @author Delete020
 * @since 12/16/22 19:02 PM
 */
public class MinimumElementstoAddtoFormaGivenSum {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int i : nums) sum += i;
        return (int) ((Math.abs(sum - goal) + limit - 1.0) / limit);
    }
}