/**
 * @author Delete020
 * @since 11/03/22 20:17 PM
 */
public class MaximumRepeatingSubstring {
    public int maxRepeating(String s, String word) {
        int ans = 0;
        int n = s.length();
        int k = word.length();
        for (int i = 0; i <= n - k; i++) {
            int cnt = 0;
            for (int j = i; j <= n - k && s.substring(j, j + k).equals(word); j += k) {
                cnt++;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}