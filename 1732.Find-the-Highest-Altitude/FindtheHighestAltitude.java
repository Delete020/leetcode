/**
 * @author Delete020
 * @since 11/19/22 16:06 PM
 */
public class FindtheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int pre = 0;
        for (int i : gain) {
            pre += i;
            ans = Math.max(ans, pre);
        }
        return ans;
    }
}