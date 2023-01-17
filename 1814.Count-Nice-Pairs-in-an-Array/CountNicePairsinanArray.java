import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 01/17/23 20:43 PM
 */
public class CountNicePairsinanArray {
    public int countNicePairs(int[] nums) {
        long ans = 0;
        int mod = (int) 1e9 + 7;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] - rev(nums[i]);
            cnt.put(nums[i], cnt.getOrDefault(nums[i], 0) + 1);
        }
        for (int i : cnt.values()) ans += ((long) i * (i - 1) / 2) % mod;
        return (int) (ans % mod);
    }

    private int rev(int i) {
        int ans = 0;
        while (i != 0) {
            ans *= 10;
            ans += i % 10;
            i /= 10;
        }
        return ans;
    }
}