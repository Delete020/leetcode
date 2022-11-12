/**
 * @author Delete020
 * @since 11/12/22 22:20 PM
 */
public class DetermineifStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        int l = 0;
        int r = s.length() - 1;
        int[] cnt = new int[26];
        while (l < r) {
            cnt[Character.toLowerCase(s.charAt(l++)) - 'a']++;
            cnt[Character.toLowerCase(s.charAt(r--)) - 'a']--;
        }
        return cnt[0] + cnt['e' - 'a'] + cnt['i' - 'a'] + cnt['o' - 'a'] + cnt['u' - 'a'] == 0;
    }
}