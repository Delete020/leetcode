/**
 * @author Delete020
 * @since 04/13/23 22:06 PM
 */
public class MostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        int[] map = new int[100001];
        int max = 0, ans = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i % 2 == 1) continue;
            if (++map[i] > max) {
                max = map[i];
                ans = i;
            } else if (map[i] == max) {
                ans = Math.min(ans, i);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}