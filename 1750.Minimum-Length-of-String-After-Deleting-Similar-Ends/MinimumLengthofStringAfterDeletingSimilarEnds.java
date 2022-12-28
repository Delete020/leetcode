/**
 * @author Delete020
 * @since 12/28/22 19:08 PM
 */
public class MinimumLengthofStringAfterDeletingSimilarEnds {
    public int minimumLength(String s) {
        char[] c = s.toCharArray();
        int l = 0, r = c.length - 1;
        while (l < r && c[l] == c[r]) {
            char ch = c[l];
            while (l <= r && c[l] == ch) l++;
            while (r >= l && c[r] == ch) r--;
        }
        return r - l + 1;
    }
}