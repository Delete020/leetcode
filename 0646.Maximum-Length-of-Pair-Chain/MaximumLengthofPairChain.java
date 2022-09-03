import java.util.Arrays;

/**
 * @author Delete020
 * @since 09/03/22 16:55 PM
 */
public class MaximumLengthofPairChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        int ans = 1;
        int min = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > min) {
                ans++;
                min = pairs[i][1];
            } else {
                min = Math.min(min, pairs[i][1]);
            }
        }
        return ans;
    }
}