/**
 * @author Delete020
 * @since 02/16/23 21:35 PM
 */
public class MaximumNumberofPairsinArray {
    public int[] numberOfPairs(int[] nums) {
        int[] cnt = new int[101];
        int[] ans = new int[2];
        for (int i : nums) cnt[i]++;
        for (int i : cnt) {
            ans[0] += i / 2;
            ans[1] += i % 2;
        }
        return ans;
    }
}