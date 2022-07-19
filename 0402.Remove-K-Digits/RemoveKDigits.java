import java.util.Stack;

/**
 * @author Delete020
 * @since 07/19/22 21:16 PM
 */
public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i;

        for (i = 0; i < num.length() && k > 0; i++) {
            char c = num.charAt(i);
            while (!stack.isEmpty() && stack.peek() > c && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        stack.forEach(sb::append);
        if (k <= 0) {
            sb.append(num.substring(i));
        }

        while (k-- > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() > 0 ? sb.toString() : "0";
    }
}