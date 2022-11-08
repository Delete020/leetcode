/**
 * @author Delete020
 * @since 11/08/22 23:29 PM
 */
public class CounttheNumberofConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = words.length;
        boolean[] alphabet = new boolean[26];
        for (char c : allowed.toCharArray()) {
            alphabet[c - 'a'] = true;
        }

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (!alphabet[c - 'a']) {
                    ans--;
                    break;
                }
            }
        }

        return ans;
    }
}