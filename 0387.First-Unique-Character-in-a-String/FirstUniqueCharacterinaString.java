/**
 * @author Delete020
 * @since 11/03/22 20:20 PM
 */
public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (map[c] == 0) map[c] = i + 1;
            else map[c] = -1;
        }
        int ans = Integer.MAX_VALUE;
        for (int j : map) {
            if (j > 0) ans = Math.min(ans, j - 1);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}