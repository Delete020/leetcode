import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Delete020
 * @since 01/18/23 22:04 PM
 */
public class FindingMKAverage {
    int m, k, n;
    Deque<Integer> queue;
    Map<Integer, Integer> map;

    public FindingMKAverage(int m, int k) {
        this.m = m;
        this.k = k;
        n = m - k;
        queue = new LinkedList<>();
        map = new TreeMap<>();
    }

    public void addElement(int num) {
        if (queue.size() == m) {
            int removed = queue.poll();
            map.put(removed, map.get(removed) - 1);
            if (map.get(removed) == 0) map.remove(removed);
        }
        queue.offer(num);
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    public int calculateMKAverage() {
        if (queue.size() != m) return -1;
        int cnt = 0;
        int sum = 0;
        for (var set : map.entrySet()) {
            int pre = cnt;
            cnt += set.getValue();
            if (cnt > k) {
                sum += set.getValue() * set.getKey();
                if (pre < k) sum -= set.getKey() * (k - pre);
            }
            if (cnt > n) {
                sum -= set.getKey() * (cnt - n);
                break;
            }
        }
        return sum / (n - k);
    }
}