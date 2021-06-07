import java.util.LinkedList;

/**
 * @author cancel
 * @since 6/7/21 6:07 PM
 */
public class MaxQueue {

    private final LinkedList<Integer> queue;
    private final LinkedList<Integer> max;


    public MaxQueue() {
        queue = new LinkedList<>();
        max = new LinkedList<>();
    }

    public int max_value() {
        return max.isEmpty() ? -1 : max.getFirst();
    }

    public void push_back(int value) {
        queue.addLast(value);
        if (max.isEmpty() || max.getFirst() < value) {
            max.clear();
        }
        while (!max.isEmpty() && max.getLast() < value) {
            max.removeLast();
        }
        max.addLast(value);
    }

    public int pop_front() {
        if (!max.isEmpty() && max.getFirst().equals(queue.getFirst())) {
            max.removeFirst();
        }
        return queue.isEmpty() ? -1 : queue.removeFirst();
    }
}
