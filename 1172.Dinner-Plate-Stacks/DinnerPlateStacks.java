import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author Delete020
 * @since 04/28/23 12:38 PM
 */
public class DinnerPlateStacks {
    private int top;
    private int capacity;
    private PriorityQueue<Integer> pq;
    private List<Stack<Integer>> plates;

    public DinnerPlateStacks(int capacity) {
        this.capacity = capacity;
        top = 0;
        pq = new PriorityQueue<>(Integer::compareTo);
        plates = new ArrayList<>();
        plates.add(new Stack<>());
        pq.add(top);
    }

    public void push(int val) {
        int index = pq.peek();
        Stack<Integer> cur = plates.get(index);
        cur.push(val);
        if (cur.size() == capacity) {
            pq.poll();
            if (index == top) {
                pq.add(++top);
                plates.add(new Stack<>());
            }
        }
    }

    public int pop() {
        int ans = popAtStack(top);
        while (ans == -1 && top > 0) {
            ans = popAtStack(--top);
        }
        return ans;
    }

    public int popAtStack(int index) {
        if (index > top) return -1;
        Stack<Integer> cur = plates.get(index);
        if (cur == null || cur.isEmpty()) return -1;
        if (cur.size() == capacity) pq.add(index);
        return cur.pop();
    }
}