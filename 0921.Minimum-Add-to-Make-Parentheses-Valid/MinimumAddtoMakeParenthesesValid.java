/**
 * @author Delete020
 * @since 10/04/22 17:54 PM
 */
public class MinimumAddtoMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        int l = 0, r = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                r++;
            } else {
                if (r != 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return l + r;
    }
}