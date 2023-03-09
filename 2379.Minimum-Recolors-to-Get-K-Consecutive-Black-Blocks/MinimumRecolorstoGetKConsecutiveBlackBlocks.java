/**
 * @author Delete020
 * @since 03/09/23 21:01 PM
 */
public class MinimumRecolorstoGetKConsecutiveBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        int ans = Integer.MAX_VALUE;
        int cnt = 0;
        k--;
        for (int i = 0; i < blocks.length(); i++) {
            cnt += blocks.charAt(i) == 'W' ? 1 : 0;
            if (i >= k) {
                ans = Math.min(ans, cnt);
                cnt -= blocks.charAt(i - k) == 'W' ? 1 : 0;
            }
        }
        return ans;
    }
}