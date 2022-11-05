import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Delete020
 * @since 11/05/22 19:49 PM
 */
public class ParsingABooleanExpression {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (c == ',') continue;
            if (c == ')') hander(stack);
            else stack.push(c);
        }
        return stack.peek() == 't';
    }

    private void hander(Stack<Character> stack) {
        List<Character> list = new ArrayList<>();
        while (stack.peek() != '(') {
            list.add(stack.pop());
        }
        stack.pop();
        char operate = stack.pop();
        switch (operate) {
            case '!' -> stack.push(list.get(0) == 'f' ? 't' : 'f');
            case '&' -> stack.push(list.contains('f') ? 'f' : 't');
            case '|' -> stack.push(list.contains('t') ? 't' : 'f');
        }
    }
}