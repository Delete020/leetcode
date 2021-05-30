import java.util.LinkedList;

/**
 * @author cancel
 * @since 5/30/21 10:18 AM
 */
public class MinStack {

    private final LinkedList<Integer> stack;
    private final LinkedList<Integer> min;

    public MinStack() {
        stack = new LinkedList<>();
        min = new LinkedList<>();
    }

    public void push(int val) {
        stack.push(val);
        if (min.isEmpty() || min.getFirst() >= val) {
            min.push(val);
        }
    }

    public void pop() {
        if (stack.pop().equals(min.getFirst())) {
            min.pop();
        }
    }

    public int top() {
        return stack.getFirst();
    }

    public int getMin() {
        return min.getFirst();
    }
}
