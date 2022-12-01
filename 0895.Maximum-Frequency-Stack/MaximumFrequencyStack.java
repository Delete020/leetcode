import java.util.*;

/**
 * @author Delete020
 * @since 11/30/22 18:53 PM
 */
public class MaximumFrequencyStack {
    List<Stack<Integer>> list;
    Map<Integer, Integer> freq;
    int size;

    public MaximumFrequencyStack() {
        list = new ArrayList<>();
        size = 0;
        freq = new HashMap<>();
    }

    public void push(int val) {
        int times = freq.getOrDefault(val, 0) + 1;
        freq.put(val, times);
        if (list.size() < times) {
            list.add(new Stack<>());
            size++;
        }
        list.get(times - 1).push(val);
    }

    public int pop() {
        int num = list.get(size - 1).pop();
        freq.put(num, freq.get(num) - 1);
        if (list.get(size - 1).isEmpty()) {
            list.remove(--size);
        }
        return num;
    }
}