/**
 * @author Delete020
 * @since 07/23/22 23:07 PM
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int i;
        for (i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (String s : strs) {
                if (s.length() < i + 1 || s.charAt(i) != c) {
                    return s.substring(0, i);
                }
            }
        }
        return strs[0].substring(0, i);
    }
}