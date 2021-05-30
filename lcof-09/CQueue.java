import java.util.LinkedList;

/**
 * @author cancel
 * @since 5/30/21 9:55 AM
 */
public class CQueue {

    private LinkedList<Integer> head;
    private LinkedList<Integer> tail;

    public CQueue() {
        head = new LinkedList<>();
        tail = new LinkedList<>();
    }

    public void appendTail(int value) {
        head.push(value);
    }

    public int deleteHead() {
        if (!tail.isEmpty()) {
            return tail.pop();
        }

        if (head.isEmpty()) {
            return -1;
        }

        while (!head.isEmpty()) {
            tail.push(head.pop());
        }

        return tail.pop();
    }

}
