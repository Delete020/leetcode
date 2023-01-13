/**
 * @author Delete020
 * @since 01/13/23 19:50 PM
 */
public class RearrangeCharacterstoMakeTargetString {
    public int rearrangeCharacters(String s, String target) {
        int[] tCnt = new int[26];
        int[] sCnt = new int[26];
        int ans = 999;
        for (char c : s.toCharArray()) sCnt[c - 'a']++;
        for (char c : target.toCharArray()) tCnt[c - 'a']++;
        for (int i = 0; i < 26; i++) {
            if (tCnt[i] != 0) {
                ans = Math.min(sCnt[i] / tCnt[i], ans);
            }
        }
        return ans;
    }
}