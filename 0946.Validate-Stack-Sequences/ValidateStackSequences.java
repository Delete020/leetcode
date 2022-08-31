import java.util.Stack;

/**
 * @author Delete020
 * @since 08/31/22 20:04 PM
 */
public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pop = 0;
        int l = 0;
        int r = 0;
        int n = popped.length;
        while (pop != n) {
            if (stack.isEmpty() || stack.peek() != popped[r]) {
                if (l >= n) {
                    return false;
                }
                while (l < n && pushed[l] != popped[r]) {
                    stack.push(pushed[l++]);
                }
                if (l < n && pushed[l] == popped[r]) {
                    l++;
                }
            } else {
                stack.pop();
            }
            r++;
            pop++;
        }

        return true;
    }
}