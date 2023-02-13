/**
 * @author Delete020
 * @since 02/13/23 20:53 PM
 */
public class ReplacetheSubstringforBalancedString {
    public int balancedString(String s) {
        int n = s.length() / 4;
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) cnt[c - 'A']++;
        int head = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'A']--;
            while (head < n * 4 && cnt['Q' - 'A'] <= n && cnt['W' - 'A'] <= n && cnt['E' - 'A'] <= n && cnt['R' - 'A'] <= n) {
                ans = Math.min(ans, i - head + 1);
                cnt[s.charAt(head++) - 'A']++;
            }
        }
        return ans;
    }
}