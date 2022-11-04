/**
 * @author Delete020
 * @since 11/04/22 23:55 PM
 */
public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            cnt[c - 'a']--;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0) return (char) ('a' + i);
        }
        return 'a';
    }
}