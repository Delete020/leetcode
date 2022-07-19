import java.util.Stack;

/**
 * @author Delete020
 * @since 07/19/22 21:17 PM
 */
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int[] count = new int[26];
        boolean[] mark = new boolean[26];
        char A = 'a';

        for (char c : s.toCharArray()) {
            count[c - A]++;
        }

        for (char c : s.toCharArray()) {
            if (!mark[c - A]) {
                while (!stack.isEmpty() && stack.peek() > c) {
                    if (count[stack.peek() - A] > 0) {
                        mark[stack.pop() - A] = false;
                    } else {
                        break;
                    }
                }
                mark[c - A] = true;
                stack.push(c);
            }
            count[c - A]--;
        }

        stack.forEach(sb::append);
        return sb.toString();
    }
}