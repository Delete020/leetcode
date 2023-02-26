/**
 * @author Delete020
 * @since 02/26/23 13:08 PM
 */
public class MaximumScoreWordsFormedbyLetters {
    int ans;
    int n;

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] map = new int[26];
        ans = 0;
        n = words.length;
        for (char c : letters) map[c - 'a']++;
        for (int i = 0; i < n; i++) {
            backtrack(words, map.clone(), score, i, 0);
        }
        return ans;
    }

    private void backtrack(String[] words, int[] map, int[] score, int cur, int cnt) {
        if (cur == n) return;
        backtrack(words, map, score, cur + 1, cnt);
        int[] curMap = map.clone();
        int s = cnt;
        for (char c : words[cur].toCharArray()) {
            if (curMap[c - 'a']-- == 0) return;
            s += score[c - 'a'];
        }
        ans = Math.max(ans, s);
        backtrack(words, curMap, score, cur + 1, s);
    }
}