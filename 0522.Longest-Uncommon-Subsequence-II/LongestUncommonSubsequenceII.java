/**
 * @author Delete020
 * @since 6/27/22 8:34 PM
 */
public class LongestUncommonSubsequenceII {
    public int findLUSlength(String[] strs) {
        int max = -1;
        for (int i = 0; i < strs.length; i++) {
            String curr = strs[i];
            boolean sp = true;

            for (int j = 0; j < strs.length; j++) {
                if (i == j) {
                    continue;
                }
                if (isSub(curr, strs[j])) {
                    sp = false;
                    break;
                }
            }

            if (sp) {
                max = Math.max(max, curr.length());
            }
        }

        return max;
    }

    private boolean isSub(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s1.length();
    }
}
