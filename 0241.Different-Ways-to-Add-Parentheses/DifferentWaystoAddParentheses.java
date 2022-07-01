import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 07/01/22 22:07 PM
 */
public class DifferentWaystoAddParentheses {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (int x : left) {
                    for (int y : right) {
                        if (c == '+') {
                            res.add(x + y);
                        } else if (c == '-') {
                            res.add(x - y);
                        } else {
                            res.add(x * y);
                        }
                    }
                }
            }
        }

        if (res.isEmpty()) {
            res.add(Integer.parseInt(expression));
        }
        return res;
    }
}