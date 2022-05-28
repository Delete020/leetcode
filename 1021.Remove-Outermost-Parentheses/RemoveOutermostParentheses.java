import java.util.Stack;

/**
 * @author Delete020
 * @since 5/28/22 1:21 PM
 */
public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ')') {
                stack.pop();
            }
            if (!stack.empty()) {
                sb.append(c);
            }
            if (c == '(') {
                stack.push(c);
            }
        }

        return sb.toString();
    }
}
