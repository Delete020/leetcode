/**
 * @author Delete020
 * @since 10/09/22 22:34 PM
 */
public class ScoreofParentheses {
    public int scoreOfParentheses(String s) {
        int deep = 0, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') deep++;
            else deep--;
            if (c == ')' && s.charAt(i - 1) == '(') ans += 1 << deep;
        }
        return ans;
    }
}