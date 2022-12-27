/**
 * @author Delete020
 * @since 12/27/22 21:16 PM
 */
public class MinimumMovestoConvertString {
    public int minimumMoves(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                i += 2;
                ans++;
            }
        }
        return ans;
    }
}