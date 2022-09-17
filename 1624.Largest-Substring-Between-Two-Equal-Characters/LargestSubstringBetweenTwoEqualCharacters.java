/**
 * @author Delete020
 * @since 09/17/22 18:56 PM
 */
public class LargestSubstringBetweenTwoEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] map = new int[26];
        Arrays.fill(map, -1);
        int ans = 0;
        char c = 'a';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (map[c - 'a'] != -1) {
                ans = Math.max(ans, i - map[c - 'a']);
            } else {
                map[c - 'a'] = i;
            }
        }
        return ans - 1;
    }
}