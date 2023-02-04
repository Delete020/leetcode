/**
 * @author Delete020
 * @since 02/04/23 15:10 PM
 */
public class MaximumNumberofConsecutiveValuesYouCanMake {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int ans = 1;
        for (int coin : coins) {
            if (ans < coin) break;
            ans += coin;
        }
        return ans;
    }
}