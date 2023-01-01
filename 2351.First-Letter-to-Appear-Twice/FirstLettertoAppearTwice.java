/**
 * @author Delete020
 * @since 01/01/23 11:29 AM
 */
public class FirstLettertoAppearTwice {
    public char repeatedCharacter(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            if (++cnt[c - 'a'] > 1) return c;
        }
        return 'a';
    }
}