/**
 * @author Delete020
 * @since 02/15/23 20:27 PM
 */
public class CheckIfItIsaGoodArray {
    public boolean isGoodArray(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            ans = gcd(ans, i);
            if (ans == 1) return true;
        }
        return false;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}